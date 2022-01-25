package com.example.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Good(view: android.view.View) {
        Toast.makeText(this, "Good Jop", Toast.LENGTH_LONG).show()
    }
}