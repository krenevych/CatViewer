package com.example.catviewer

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catviewer.databinding.ActivityRadioViewerBinding
import com.example.catviewer.databinding.ActivitySpinnerBinding

class SpinnerViewerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivitySpinnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySpinnerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.cats,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        binding.spinnerCat.adapter = adapter

        binding.spinnerCat.onItemSelectedListener = this

    }

    private val catsResources = listOf(
        R.drawable.cat_relaxed,
        R.drawable.cat_sitting,
        R.drawable.cat_jumping
    )

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        binding.imageCat.setImageResource(catsResources[position])
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        Log.d("XXXX", "onNothingSelected")
    }
}