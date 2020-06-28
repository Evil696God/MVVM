package com.kuke.mvvm

import androidx.databinding.ObservableField
import com.kuke.mvvm.base.model.BaseModel

class MainModel : BaseModel<MainViewModel>() {
    private var countDown = 1

    fun loadTitle(): TestBean {
        return TestBean()
    }

    fun getTitle(): String {
        countDown++
        return "Hello World" + countDown
    }
}