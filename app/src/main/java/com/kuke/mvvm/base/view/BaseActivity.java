package com.kuke.mvvm.base.view;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.kuke.mvvm.BR;
import com.kuke.mvvm.MvpInstantiationUtils;
import com.kuke.mvvm.base.viewModel.BaseViewModel;

public abstract class BaseActivity<VM extends BaseViewModel, D extends ViewDataBinding> extends AbstractBaseActivity {
    protected D dataBinding;
    protected VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, getLayoutResID());
        viewModel = MvpInstantiationUtils.getInstantiation(
                this,
                MvpInstantiationUtils.FIRSTGENERICITY
        );
        viewModel.setContext(this);
        dataBinding.setVariable(BR.viewModel, viewModel);
    }
}
