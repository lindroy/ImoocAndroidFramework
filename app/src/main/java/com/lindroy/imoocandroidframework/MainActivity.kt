package com.lindroy.imoocandroidframework

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lindroy.imoocandroidframework.mvc.MVCActivity
import com.lindroy.imoocandroidframework.normal.NormalActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNormal.setOnClickListener {
            startActivity(Intent(this, NormalActivity::class.java))
        }
        btnMVC.setOnClickListener {
            startActivity(Intent(this, MVCActivity::class.java))
        }
    }


}
