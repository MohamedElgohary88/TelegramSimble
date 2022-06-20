package com.example.telegramsimble

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        m_filed_message.addTextChangedListener(this)
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }
    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        if (m_filed_message.text.isNotEmpty()){
            m_send.visibility = View.VISIBLE
           var layoutP = m_filed_message.layoutParams as LinearLayout.LayoutParams
            layoutP.weight = 8f
        }else{
            m_send.visibility = View.GONE
            var layoutP = m_filed_message.layoutParams as LinearLayout.LayoutParams
            layoutP.weight = 9f
        }
    }
    override fun afterTextChanged(p0: Editable?) {
    }
}