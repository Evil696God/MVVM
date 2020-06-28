package com.kuke.mvvm.base.model;

import com.kuke.mvvm.base.viewModel.BaseViewModel;

public class BaseModel<VM extends BaseViewModel> {
    protected VM viewModel;
    public void setViewModel(VM viewModel) {
        this.viewModel = viewModel;
    }
}
