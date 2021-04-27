package com.example.myshoppalpractice

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // Your Code
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish() // Call this when your activity is done and should be closed.

        }, 2500)

//        val typeface: Typeface =
//                Typeface.createFromAsset(assets, "Montserrat-Bold.ttf")
//        tv_app_name.typeface = typeface
    }
}