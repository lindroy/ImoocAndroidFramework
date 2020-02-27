package com.lindroy.imoocandroidframework.mvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lindroy.imoocandroidframework.R
import com.lindroy.imoocandroidframework.databinding.ActivityMvvmBinding

/**
 * @author Lin
 * @date 2020/2/27
 * @function 使用MVVM框架实现查询用户信息的功能
 * @Description
 */
class MVVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMvvmBinding>(this, R.layout.activity_mvvm)
        val mvvmViewModel = MVVMViewModel(application)
        binding.viewModel = mvvmViewModel
    }
}
