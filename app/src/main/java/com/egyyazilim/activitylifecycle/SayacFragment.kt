package com.egyyazilim.activitylifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.egyyazilim.activitylifecycle.databinding.FragmentSayacBinding

class SayacFragment : Fragment() {

    private var _binding: FragmentSayacBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSayacBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val defaultVal = 0

        binding.textViewSayac.text = defaultVal.toString()

        binding.buttonSayac.setOnClickListener {
            binding.apply {
                val currentVal = textViewSayac.text.toString().toInt()
                textViewSayac.text = (currentVal+1).toString()
            }

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e("SayacFragment","onCreate Çağrıldı")
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Log.e("SayacFragment","onAttach Çağrıldı")
        super.onAttach(context)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDetach() {
        super.onDetach()
    }

}