package com.example.catviewer

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catviewer.databinding.ActivitySpinnerBinding
import com.example.catviewer.databinding.ActivityToggleViewerBinding

class ToggleViewerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToggleViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityToggleViewerBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPushCat.setOnCheckedChangeListener { btn, isChecked ->
            if (isChecked){
                binding.imageCat.setImageResource(R.drawable.cat_jumping)
            } else {
                binding.imageCat.setImageResource(R.drawable.cat_relaxed)
            }
        }
    }
}