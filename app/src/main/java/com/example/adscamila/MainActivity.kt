package com.example.adscamila

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AppCompatActivity as AppCompatActivity1


class MainActivity : AppCompatActivity1() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java)
            val params = Bundle()
            val textoDigitado = editText.text.toString()
            params.putString("texto",textoDigitado)
            intent.putExtras(params)
            startActivity(intent)

        }
    }
}