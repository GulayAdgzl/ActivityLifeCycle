package com.egyyazilim.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.egyyazilim.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val varsayılanDeger=0
        binding.apply {
            textViewSayac.text=varsayılanDeger.toString()

            buttonSayac.setOnClickListener {
                val gelenDeger=textViewSayac.text.toString().toInt()
                textViewSayac.text=(gelenDeger+1).toString()
            }
        }
    }
}