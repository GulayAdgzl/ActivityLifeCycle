package com.egyyazilim.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
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
    private fun onPaylas(){
        val share= Intent.createChooser(Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,binding.textViewSayac.text.toString())
        },null)
        startActivity(share)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.paylas_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity","onStart")
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_paylas ->onPaylas()
        }
        return super.onOptionsItemSelected(item)
    }

}