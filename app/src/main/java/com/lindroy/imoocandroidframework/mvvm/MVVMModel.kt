package com.lindroy.imoocandroidframework.mvvm

import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback
import java.util.*

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVVM-Model层
 */
class MVVMModel {
    /**
     * 根据输入的用户名查询用户信息
     * 使用随机布尔值模拟网络请求
     */
    fun getAccountInfo(name: String, callback: NetworkCallback) {
        when (Random().nextBoolean()) {
            true -> callback.onSuccess(Account(name, 1))
            false -> callback.onFailed()
        }
    }
}