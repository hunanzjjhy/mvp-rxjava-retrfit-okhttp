package com.huyong.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.huyong.base.BaseActivity;
import com.huyong.entity.GetCodeBean;
import com.huyong.master.R;
import com.huyong.presenter.GetCodePresenter;
import com.huyong.utils.ToastUtil;
import com.huyong.view.GetCodeView;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by tiansj on 15/7/31.
 */
public class LoginActivity extends BaseActivity<GetCodePresenter> implements GetCodeView {

    @Bind(R.id.textHeadTitle)
    TextView textHeadTitle;
    @Bind(R.id.tv_register)
    TextView tv_register;
    @Bind(R.id.tv_forgt_psw)
    TextView tv_forgt_psw;
    @Bind(R.id.btnSure)
    Button btnSure;

    @Override
    protected GetCodePresenter loadPresenter() {
        return new GetCodePresenter();
    }


    @Override
    protected void initData() {
        mPresenter.getCodeInfo("18510167458");
    }

    @Override
    protected void initListener() {
        btnSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(LoginActivity.this, HideActivity.class));
            }
        });
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        tv_forgt_psw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ForgetPsdActivity.class));
            }
        });
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        textHeadTitle.setText("登录");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void otherViewClick(View view) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @Override
    public void getCodeSuccess(GetCodeBean bean) {
        if (bean.getStatus().equals("success"))
            tv_forgt_psw.setText(bean.getCode());
        else {
            ToastUtil.setToast(bean.getInfo());
        }
    }

    public void getCodeFail(String str) {
        tv_forgt_psw.setText(str);
    }
}
