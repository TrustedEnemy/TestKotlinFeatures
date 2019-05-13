package com.example.testkotlinfeatures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClickHere.setOnClickListener {

            val msg: String = etName.text.toString();

            val intent = Intent(this,SecondActivity::class.java)

            intent.putExtra("myMsg",msg)

            Toast.makeText(this,"Sending Text to Sec Activity",Toast.LENGTH_SHORT).show()

            startActivity(intent)

        }
    }
}
