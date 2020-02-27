package com.lindroy.imoocandroidframework.mvc

import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback
import java.util.*

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVC-Model层
 */
class MVCModel {
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