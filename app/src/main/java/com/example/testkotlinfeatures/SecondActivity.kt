package com.example.testkotlinfeatures

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

    val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("myMsg")

        tvShowName.setText(msg)

        btnGotoFirst.setOnClickListener {

            val intentSec = Intent(this,MainActivity::class.java)
            startActivity(intentSec)

        }


        //Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()

    }

}