package com.example.catviewer

import android.os.Bundle
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catviewer.databinding.ActivityRadioViewerBinding
import com.example.catviewer.databinding.ActivityRecyclerViewerBinding

class RecyclerViewViewerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRecyclerViewerBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

}