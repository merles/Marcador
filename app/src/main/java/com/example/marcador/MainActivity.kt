package com.example.marcador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun incP1(view: View){
        val strPunts = findViewById<TextView>(R.id.p1)
        var punts = strPunts.text.toString().toInt()
        punts += 1
        findViewById<TextView>(R.id.p1).apply{text = punts.toString()}
    }
    fun decP1(view: View){
        val strPunts = findViewById<TextView>(R.id.p1)
        var punts = strPunts.text.toString().toInt()
        punts -= 1
        findViewById<TextView>(R.id.p1).apply{text = punts.toString()}
    }
    fun incP2(view: View){
        val strPunts = findViewById<TextView>(R.id.p2)
        var punts = strPunts.text.toString().toInt()
        punts += 1
        findViewById<TextView>(R.id.p2).apply{text = punts.toString()}
    }
    fun decP2(view: View){
        val strPunts = findViewById<TextView>(R.id.p2)
        var punts = strPunts.text.toString().toInt()
        punts -= 1
        findViewById<TextView>(R.id.p2).apply{text = punts.toString()}
    }
}
