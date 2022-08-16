package com.application.vietlotteryfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewPagerAdapter.AdapterInterface {

    private val intefaces by lazy { this }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val detail = listOf(R.string.v1, R.string.v2, R.string.v3, R.string.v4, R.string.v5, R.string.v6, R.string.v7)
        val images = listOf(R.drawable.navbar, R.drawable.navbar, R.drawable.navbar, R.drawable.navbar, R.drawable.navbar, R.drawable.navbar, R.drawable.navbar)
        val adapter = ViewPagerAdapter(this, images, detail, intefaces)
        viewPager2.adapter = adapter
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}