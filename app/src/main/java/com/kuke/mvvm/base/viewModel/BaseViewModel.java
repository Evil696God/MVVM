package com.kuke.mvvm.base.viewModel;

import com.kuke.mvvm.MvpInstantiationUtils;
import com.kuke.mvvm.base.model.BaseModel;
import com.kuke.mvvm.base.view.BaseActivity;

public class BaseViewModel<M extends BaseModel, V extends BaseActivity> {
    protected M model;
    protected V context;

    public BaseViewModel() {
        model = MvpInstantiationUtils.getInstantiation(this, MvpInstantiationUtils.FIRSTGENERICITY);
        model.setViewModel(this);
    }

    public void setContext(V context) {
        this.context = context;
    }
}
