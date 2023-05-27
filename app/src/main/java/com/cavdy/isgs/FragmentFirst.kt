package com.cavdy.isgs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class FragmentFirst : AppCompatActivity() {

    val players = arrayOf("Ronaldo", "Messi", "Neymar", "MBappe")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_first)

        val spinner = findViewById<Spinner>(R.id.spinner2)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, players)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext, "Selected player is = "+players[position],Toast.LENGTH_SHORT).show()
            }
        }
    }
}