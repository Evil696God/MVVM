package com.kuke.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.kuke.mvvm.base.view.BaseActivity
import com.kuke.mvvm.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    fun titleOnClick(view: View) {
//        viewModel?.loadTitle()
        Log.e("viewModel", "viewModel:" + dataBinding.viewModel)
        viewModel?.loadTitle()
    }

    override fun getLayoutResID(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
    }

    override fun initData() {
    }
}
