package com.example.tabooada

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tabooada.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Lógica do spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.num_tabuada,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerMultiplies.adapter = adapter


        var tabuadaSelecionada = 0
        binding.spinnerMultiplies.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    tabuadaSelecionada = p2
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }

        binding.btnConsultarTabuada.setOnClickListener {

        }
    }
}