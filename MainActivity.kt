package com.test.putextraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val et:EditText = findViewById(R.id.et)
       val btn:Button  = findViewById(R.id.btn)

       btn.setOnClickListener {
           val intent =Intent(this,MA2::class.java)

           intent.putExtra("MY_NAME",et.text.toString())
           startActivity(intent)
       }
    }
}