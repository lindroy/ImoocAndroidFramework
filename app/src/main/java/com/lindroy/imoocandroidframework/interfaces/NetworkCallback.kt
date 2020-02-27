package com.lindroy.imoocandroidframework.interfaces

import com.lindroy.imoocandroidframework.bean.Account

/**
 * @author Lin
 * @date 2020/2/27
 * @function 网络请求回调
 */
interface NetworkCallback {
    fun onSuccess(account: Account)
    fun onFailed()
}