package com.healing.backcsootown.bottomnavifragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.healing.backcsootown.R
import com.healing.backcsootown.databinding.FragmentBottomnaviJobInfoBinding
import com.healing.backcsootown.databinding.FragmentBottomnaviMypageBinding

class BottomNaviMypageFragment: Fragment() {

    lateinit var binding:FragmentBottomnaviMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_bottomnavi_mypage,container,false)
        return binding.root
    }
}