package com.kuke.mvvm

import android.content.Context
import android.util.Log
import androidx.databinding.ObservableField
import com.kuke.mvvm.base.viewModel.BaseViewModel
import com.kuke.mvvm.databinding.ActivityMainBinding

class MainViewModel : BaseViewModel<MainModel, MainActivity>() {
    var title = ObservableField<String>()

    fun loadTitle() {
        Log.e("title", "title:" + model?.getTitle())
        title.set(model?.getTitle())
    }

}