package com.lindroy.imoocandroidframework.mvvm

import android.app.Application
import android.util.Log
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.lindroy.imoocandroidframework.BR
import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVVM-ViewModel层
 */
//ViewModel层一般都需要传入一个Application的对象
class MVVMViewModel(private val application: Application) : BaseObservable() {

    private val model = MVVMModel()

    @get:Bindable
    var userInput: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.userInput)
        }

    @get:Bindable
    var result: String = ""
        set(result) {
            field = result
            notifyPropertyChanged(BR.result)
        }

    fun getData(view: View) {
        model.getAccountInfo(userInput, object : NetworkCallback {
            override fun onSuccess(account: Account) {
               result= "用户名称：${account.name}，等级：${account.level}"
            }

            override fun onFailed() {
                result = "获取用户信息失败"
            }
        })
    }

}