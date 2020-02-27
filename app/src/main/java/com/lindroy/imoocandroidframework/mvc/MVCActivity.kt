package com.lindroy.imoocandroidframework.mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lindroy.imoocandroidframework.R
import com.lindroy.imoocandroidframework.bean.Account
import com.lindroy.imoocandroidframework.interfaces.NetworkCallback
import kotlinx.android.synthetic.main.activity_normal.*

/**
 * @author Lin
 * @date 2020/2/27
 * @function MVC框架实现查询用户信息的功能
 * @Description
 */
class MVCActivity : AppCompatActivity() {

    private val mvcModel by lazy { MVCModel() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)
        initOnClick()
    }

    private fun initOnClick() {
        btnGet.setOnClickListener {
            //通知MVCModel去获取数据
            mvcModel.getAccountInfo(etUserName.text.toString(),object : NetworkCallback {
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
     * 显示查询成功的页面
     */
    private fun showSuccessPage(account: Account){
        tvResult.text = "用户名称：${account.name}，等级：${account.level}"
    }
    /**
     * 显示查询失败的页面
     */
    private fun showFailedPage(){
        tvResult.text = "获取用户信息失败"
    }
}
