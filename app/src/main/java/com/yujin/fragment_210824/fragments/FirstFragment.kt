package com.yujin.fragment_210824.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yujin.fragment_210824.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        logBtn.setOnClickListener {
            Log.d("부품에서 찍기", "로그버튼 눌림")
        }
    }



}







