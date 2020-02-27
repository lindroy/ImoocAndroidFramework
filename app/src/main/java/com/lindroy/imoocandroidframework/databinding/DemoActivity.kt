package com.lindroy.imoocandroidframework.databinding

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lindroy.imoocandroidframework.R
import com.lindroy.imoocandroidframework.bean.Account

class DemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDemoBinding
    private val account by  lazy { Account("小明", 1) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo)
        binding.account = account
        binding.activity = this
    }

    /**
     * 这里的点击事件名称必须跟xml中的保持一致，且不能为私有
     */
    fun onAddClick(view: View) {
//        binding.account = account.apply { level++ }
        binding.account!!.level++
        Log.e("Tag","等级=${binding.account!!.level}")
    }
}
