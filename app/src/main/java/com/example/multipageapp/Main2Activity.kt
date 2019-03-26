package com.example.multipageapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Button

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtshow = findViewById<TextView>(R.id.txtShow)

        val btnback = findViewById<Button>(R.id.btnBack)

        btnback.setOnClickListener(View.OnClickListener {
            this.finish()
        })

        var strShow: String = intent.getStringExtra("SendIt")
        txtshow.text = strShow

        findViewById<View>(android.R.id.content).setOnTouchListener { _, _ ->
            hideKeyboard()
            false
        }
    }
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }
}
