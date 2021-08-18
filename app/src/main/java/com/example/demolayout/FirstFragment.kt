package com.example.demolayout

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first_layout.*
import kotlinx.android.synthetic.main.seconactivity_layout.*


class FirstFragment : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getacount = arguments?.getString("acount")
        var getpass = arguments?.getString("pass")
        acount.text = getacount
        pass.text = getpass
        btn_senddata.setOnClickListener(this)
        btn_sendtofrm.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_senddata->{
                var intent = Intent(activity?.application,ThirdActivity::class.java)
                intent.putExtra("a","truong")
                intent.putExtra("b","123456")
                startActivity(intent)
            }
            R.id.btn_sendtofrm->{
                var seconFragment = SeconFragment()
                var bundle = Bundle()
                bundle.putString("acoutfrm","truong")
                bundle.putString("passfrm","123456")
                seconFragment.arguments = bundle
                fragmentManager?.beginTransaction()?.replace(R.id.ct_frame,seconFragment)?.commit()
            }
        }
    }
}
