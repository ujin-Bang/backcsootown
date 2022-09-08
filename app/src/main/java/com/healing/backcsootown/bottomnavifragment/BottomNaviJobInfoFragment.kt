package com.healing.backcsootown.bottomnavifragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.healing.backcsootown.R
import com.healing.backcsootown.databinding.FragmentBottomnaviJobInfoBinding

class BottomNaviJobInfoFragment: Fragment() {

    lateinit var binding:FragmentBottomnaviJobInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bottomnavi_job_info,container,false)
        return binding.root
    }
}