package com.example.myshoppalpractice

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myshoppalpractice.R
import android.view.WindowManager


@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed({
            // Your Code
            startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
            finish() // Call this when your activity is done and should be closed.

        }, 2500)

//        val typeface: Typeface =
//                Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
//        tv_app_name.typeface = typeface
    }
}