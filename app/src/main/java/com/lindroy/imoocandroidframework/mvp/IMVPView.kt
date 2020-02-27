package com.lindroy.imoocandroidframework.mvp

import com.lindroy.imoocandroidframework.bean.Account

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVP模式-View层
 */
interface IMVPView {
    /**
     * 获取用户输入的账户名
     */
    fun getUserInput():String

    /**
     * 展示查询成功的页面
     */
    fun showSuccessPage(account: Account)

    /**
     * 展示查询失败的页面
     */
    fun showFailedPage()
}