package com.example.demolayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_secon_layout.*

class SeconFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_secon_layout, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var a = arguments?.getString("acoutfrm")
        var b = arguments?.getString("passfrm")
        tv_acount_frm2.text = a
        tv_pass_frm2.text = b
        btn_goback.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
           R.id.btn_goback->{
//                activity?.supportFragmentManager?.findFragmentByTag("firstfragment")?.let {
//                    activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.ct_frame,it)?.commit()
//                }
            }
        }
    }
}