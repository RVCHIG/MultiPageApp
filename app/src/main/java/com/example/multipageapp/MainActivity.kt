package com.example.multipageapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btngo = findViewById<Button>(R.id.btnPage2)
        val txtsend = findViewById<EditText>(R.id.txtSend)

        btngo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("SendIt",txtsend.text.toString())
            startActivity(intent)
        })

    }
}
