package com.zerdasoftware.usingmvvm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.zerdasoftware.usingmvvm.databinding.ActivityMainBinding

class MainFragment : Fragment() {

    private lateinit var design:ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design = DataBindingUtil.inflate(inflater,
        R.layout.activity_main,container,false)

        design.textViewResult.text = "Fragment"

        return design.root
    }
}