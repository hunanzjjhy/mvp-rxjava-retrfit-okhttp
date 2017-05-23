package com.huyong.activity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.huyong.base.BaseActivity;
import com.huyong.master.R;
import com.huyong.presenter.IpInfoPresenter;
import com.huyong.view.IpInfoView;

import butterknife.Bind;

/**
 * 获取IP信息
 * Created by Administrator on 2016/12/15.
 */
public class GetIpInfoActivity extends BaseActivity<IpInfoPresenter> implements IpInfoView {
    @Bind(R.id.test_ip_bt)
    Button bt;
    @Bind(R.id.test_ip_tv)
    TextView tv;

    @Override
    protected IpInfoPresenter loadPresenter() {
        return new IpInfoPresenter();
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initListener() {
        bt.setOnClickListener(this);
    }

    @Override
    protected void initView() {
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void otherViewClick(View view) {
        mPresenter.getIpInfo("63.36.36.36");
    }

    @Override
    public void getIpInfoSuccess(String str) {
        tv.setText(str);
    }

    @Override
    public void getIpInfoFail(String failMsg) {
        tv.setText(failMsg);
    }
}
