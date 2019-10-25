package com.fastcat.winsun

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_algorihm_display.*

class AlgorithmDisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algorihm_display)
        if (intent != null) {
            tv_title.text = intent.getStringExtra("title")
        }

    }
}
