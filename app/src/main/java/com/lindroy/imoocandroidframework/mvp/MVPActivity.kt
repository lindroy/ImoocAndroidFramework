package com.lindroy.imoocandroidframework.mvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lindroy.imoocandroidframework.R
import com.lindroy.imoocandroidframework.bean.Account
import kotlinx.android.synthetic.main.activity_normal.*

/**
 * @author Lin
 * @date 2020/2/27
 * @function 使用MVP框架实现查询用户信息的功能
 * @Description
 */
class MVPActivity : AppCompatActivity(), IMVPView {

    private val presenter by lazy { MVPPresenter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        initOnClick()
    }

    private fun initOnClick() {
        btnGet.setOnClickListener {
            presenter.getAccountData()
        }
    }

    override fun getUserInput(): String = etUserName.text.toString()

    override fun showSuccessPage(account: Account) {
        tvResult.text = "用户名称：${account.name}，等级：${account.level}"
    }

    override fun showFailedPage() {
        tvResult.text = "获取用户信息失败"
    }
}
