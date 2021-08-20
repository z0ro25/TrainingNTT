package com.example.demolayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.thirdactivity_layout.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdactivity_layout)
        var inten = intent
        var a = inten.getStringExtra("a")
        var b = inten.getStringExtra("b")
        tv_acount_ac3.text = a
        tv_pass_Ac3.text = b
    }


}