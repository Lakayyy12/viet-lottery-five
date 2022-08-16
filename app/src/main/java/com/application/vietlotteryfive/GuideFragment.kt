package com.application.vietlotteryfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class GuideFragment : Fragment(), View.OnClickListener {

    private var btn1: TextView? = null
    private var btn2: TextView? = null
    private var btn3: TextView? = null

    private var btnB: Button? = null
    private var getView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        getView = inflater.inflate(R.layout.fragment_guide, container, false)

        initComponents()
        initListener()
        return getView
    }

    private fun initComponents() {
        btn1 = getView?.findViewById(R.id.btn1)
        btn2 = getView?.findViewById(R.id.btn2)
        btn3 = getView?.findViewById(R.id.btn3)
        btnB = getView?.findViewById(R.id.btnB)
    }

    private fun initListener() {
        btn1?.setOnClickListener(this)
        btn2?.setOnClickListener(this)
        btn3?.setOnClickListener(this)
        btnB?.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn1 -> { Navigator.showContent(context,  getString(R.string.g11))}
            R.id.btn2 -> { Navigator.showContent(context, getString(R.string.g22))}
            R.id.btn3 -> { Navigator.showContent(context, getString(R.string.g33))}
            R.id.btnB -> activity?.onBackPressed()
        }
    }
}
