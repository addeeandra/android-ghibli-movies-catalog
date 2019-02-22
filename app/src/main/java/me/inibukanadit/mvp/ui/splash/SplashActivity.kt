package me.inibukanadit.mvp.ui.splash

import android.os.Bundle
import me.inibukanadit.mvp.R
import me.inibukanadit.mvp.util.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_splash)
    }

}