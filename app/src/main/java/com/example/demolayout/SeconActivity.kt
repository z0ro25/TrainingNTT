package com.example.demolayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.seconactivity_layout.*

class SeconActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.seconactivity_layout)
        dataFromAc()
    }


    private fun dataFromAc() {
        var intent = intent
        var acount = intent.getStringExtra("acount")
        tv_acount.text = acount
        var pass = intent.getStringExtra("pass")
        tv_pass.text = pass
        btn_send.setOnClickListener(this)
        btn_sendnack.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_send -> {
                var animation = AnimationUtils.loadAnimation(this, R.anim.set)
                val firstFragment = FirstFragment()
                supportFragmentManager.beginTransaction().add(R.id.ct_frame, firstFragment).commit()
                val bundle = Bundle()
                bundle.putString("acount", tv_acount.text.toString())
                bundle.putString("pass", tv_pass.text.toString())
                firstFragment.arguments = bundle
                ct_frame.startAnimation(animation)
            }
            R.id.btn_sendnack -> {
                sendbackdata()
            }
        }
    }

    private fun sendbackdata() {
        var intent = Intent()
        intent.putExtra("acountt", "insert your acount")
        intent.putExtra("passs", "insert your password")
        setResult(RESULT_OK, intent)
        finish()
    }

}