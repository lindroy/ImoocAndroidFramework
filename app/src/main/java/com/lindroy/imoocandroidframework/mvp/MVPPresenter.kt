package com.lindroy.imoocandroidframework.mvp

import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVP模式-Presenter层
 */
class MVPPresenter(private val view: IMVPView) {
    /**
     * 持有Model层的引用，用于向View层传递数据
     */
    private val model by lazy { MVPModel() }

    /**
     * 获取用户数据
     */
    fun getAccountData() {
        model.getAccountInfo(view.getUserInput(), object : NetworkCallback {
            override fun onSuccess(account: Account) {
                view.showSuccessPage(account)
            }

            override fun onFailed() {
                view.showFailedPage()
            }

        })
    }
}