package com.quiet.onlytv

import android.view.KeyEvent
import com.ludoven.base.BaseActivity
import com.ludoven.base.mvp.DefaultPresenter
import com.quiet.onlytv.base.Constant
import com.quiet.onlytv.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, DefaultPresenter>() {

    private var exitTime: Long = 0

    override fun initView() {
    }


    override fun initData() {

    }



    override fun dispatchKeyEvent(event: KeyEvent?): Boolean {
        if (event?.action == KeyEvent.ACTION_DOWN) {
            when (event.keyCode) {

               in Constant.KeyCode.backKeys-> {
                   if (System.currentTimeMillis() - exitTime > 2000) {
                       showToast(R.string.exit)
                       exitTime = System.currentTimeMillis()
                   } else {
                       App.exitApp()
                   }
                   return true
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

}