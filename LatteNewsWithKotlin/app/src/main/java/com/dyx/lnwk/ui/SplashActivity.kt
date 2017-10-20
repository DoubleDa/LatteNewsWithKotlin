package com.dyx.lnwk.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.dyx.lnwk.R
import com.dyx.lnwk.ui.activity.MainActivity

class SplashActivity : AppCompatActivity() {
    @BindView(R.id.btn_next)
    lateinit var nextBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        ButterKnife.bind(this@SplashActivity)
        initView()
    }

    private fun initView() {

    }

    private fun jump(intentObj: Class<MainActivity>) {
        val intent = Intent()
        intent.setClass(this, intentObj)
        startActivity(intent)
        finish()
    }

    @OnClick(R.id.btn_next, R.id.btn_text)
    fun onViewClicked(view: View) {
        when (view.id) {
            R.id.btn_next -> jump(MainActivity::class.java)
            else -> Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
        }
    }
}
