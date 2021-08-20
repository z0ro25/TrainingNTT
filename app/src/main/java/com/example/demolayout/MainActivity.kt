package com.example.demolayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_press.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_press -> {
                var intent = Intent(this, SeconActivity::class.java)
                intent.putExtra("acount", edt_acount.text.toString())
                intent.putExtra("pass", edt_pass.text.toString())
                startActivityForResult(intent, 1000)
            }
        }
    }

    override fun onPause() {
        edt_acount.text = null
        edt_pass.text = null
        super.onPause()
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1000 -> {
                if (resultCode == RESULT_OK) {
                    edt_acount.setHint(data?.getStringExtra("acountt").toString())
                    edt_pass.setHint(data?.getStringExtra("passs").toString())
                }
            }
        }
    }
}