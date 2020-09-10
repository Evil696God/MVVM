package com.kuke.mvvm.base.viewModel;

import com.kuke.mvvm.MvpInstantiationUtils;
import com.kuke.mvvm.base.model.BaseModel;

public class BaseViewModel<M extends BaseModel> {
    protected M model;

    public BaseViewModel() {
        model = MvpInstantiationUtils.getInstantiation(this, MvpInstantiationUtils.FIRSTGENERICITY);
        model.setViewModel(this);
    }

}
