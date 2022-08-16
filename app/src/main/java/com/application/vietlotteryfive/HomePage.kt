package com.application.vietlotteryfive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.content.Context
import android.widget.TextView
import kotlinx.android.synthetic.main.custom_dialog_content.*

class HomePage : AppCompatActivity() {

    private var btn1: TextView? = null
    private var btn2: TextView? = null
    private var btn3: TextView? = null

    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            val intent = Intent(this, GuidePage::class.java)
            startActivity(intent)
        }
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "BẤM ĐÔI ĐỂ Thoát", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}

