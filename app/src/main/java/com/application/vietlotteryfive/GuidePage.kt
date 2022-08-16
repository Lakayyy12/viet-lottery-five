package com.application.vietlotteryfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.application.vietlotteryfive.Navigator.Companion.replaceFragment

class GuidePage : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)
        replaceFragment(GuideFragment(), supportFragmentManager)
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}