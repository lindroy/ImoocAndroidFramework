package com.lindroy.imoocandroidframework.normal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lindroy.imoocandroidframework.R
import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback
import kotlinx.android.synthetic.main.activity_normal.*
import java.util.*


/**
 * @author Lin
 * @date 2020/2/27
 * @function 不使用框架实现查询用户信息的功能
 * @Description
 */
class NormalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        initOnClick()
    }

    private fun initOnClick() {
        //点击查询账号信息
        btnGet.setOnClickListener {
            getAccountInfo(getUserInput(),object :NetworkCallback{
                override fun onFailed() {
                    showFailedPage()
                }

                override fun onSuccess(account: Account) {
                    showSuccessPage(account)
                }
            })
        }

    }

    /**
     * 获取用户输入的账户名
     */
    private fun getUserInput() = etUserName.text.toString()

    /**
     * 展示查询成功的页面
     */
    private fun showSuccessPage(account: Account){
        tvResult.text = "用户名称：${account.name}，等级：${account.level}"
    }
    /**
     * 展示查询失败的页面
     */
    private fun showFailedPage(){
        tvResult.text = "获取用户信息失败"
    }

    /**
     * 根据输入的用户名查询用户信息
     * 使用随机布尔值模拟网络请求
     */
    private fun getAccountInfo(name: String, callback: NetworkCallback) {
        when (Random().nextBoolean()) {
            true -> callback.onSuccess(Account(name, 1))
            false -> callback.onFailed()
        }
    }
}
