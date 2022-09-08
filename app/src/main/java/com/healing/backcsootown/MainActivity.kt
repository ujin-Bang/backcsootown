package com.healing.backcsootown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.healing.backcsootown.bottomnavifragment.BottomNaviDiaryFragment
import com.healing.backcsootown.bottomnavifragment.BottomNaviJobInfoFragment
import com.healing.backcsootown.bottomnavifragment.BottomNaviMypageFragment
import com.healing.backcsootown.bottomnavifragment.BottomNaviSuccessFragment
import com.healing.backcsootown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        initFragment()
    }

    private fun initFragment(){
        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.first -> changeFragment(BottomNaviJobInfoFragment())
                R.id.second -> changeFragment(BottomNaviDiaryFragment())
                R.id.third -> changeFragment(BottomNaviSuccessFragment())
                R.id.fourth -> changeFragment(BottomNaviMypageFragment())

            }
            true
        }
    }

    private fun changeFragment(fragment: Fragment){

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.containerLayout, fragment)
            .commit()
    }
}