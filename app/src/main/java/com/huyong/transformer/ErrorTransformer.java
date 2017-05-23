package com.huyong.transformer;

import com.huyong.exception.ErrorType;
import com.huyong.exception.ExceptionEngine;
import com.huyong.exception.ServerException;
import com.huyong.utils.LogUtils;

import rx.Observable;
import rx.functions.Func1;

/**
 * ErrorTransformer
 * Created by Administrator on 2016/12/14.
 */
public class ErrorTransformer<T> implements Observable.Transformer<T, T> {

    private static ErrorTransformer errorTransformer = null;
    private static final String TAG = "ErrorTransformer";

    @Override
    public Observable<T> call(Observable<T> responseObservable) {
        return responseObservable.map(new Func1<T, T>() {
            @Override
            public T call(T httpResult) {
                if (httpResult == null)
                    throw new ServerException(ErrorType.EMPTY_BEAN, "解析对象为空");

                LogUtils.e(TAG, httpResult.toString());

//                if (!httpResult.getStatus().equals("success"))
//                    throw new ServerException(111, "errormsg");
                return httpResult;
            }
        }).onErrorResumeNext(new Func1<Throwable, Observable<? extends T>>() {
            @Override
            public Observable<? extends T> call(Throwable throwable) {
                //ExceptionEngine为处理异常的驱动器
                throwable.printStackTrace();
                return Observable.error(ExceptionEngine.handleException(throwable));
            }
        });
    }

    /**
     * @return 线程安全, 双层校验
     */
    public static <T> ErrorTransformer<T> getInstance() {
        if (errorTransformer == null) {
            synchronized (ErrorTransformer.class) {
                if (errorTransformer == null) {
                    errorTransformer = new ErrorTransformer<>();
                }
            }
        }
        return errorTransformer;
    }
}
