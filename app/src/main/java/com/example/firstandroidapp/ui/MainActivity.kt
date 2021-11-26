package com.example.firstandroidapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.R


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var showTxtBtn: Button
    private lateinit var openActBtn: Button
    private lateinit var helloWorldTextView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloWorldTextView = findViewById(R.id.hello_world_text_view)
        showTxtBtn = findViewById(R.id.show_text)
        openActBtn = findViewById(R.id.open_activity)

        showTxtBtn.setOnClickListener(this)
        openActBtn.setOnClickListener(this)
    }

    // Executes a particular method (showText or OpenActivity) based on the button pressed
    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.show_text -> {
                showText()
            }
            R.id.open_activity -> {
                openActivity()
            }
        }
    }

    // Makes the textView visible
    private fun showText() {
        helloWorldTextView.visibility = View.VISIBLE
    }

    // Opens a new  activity in your app
    private fun openActivity() {
        val secondActivityIntent = Intent(applicationContext, SecondActivity::class.java)
        startActivity(secondActivityIntent)
    }
}