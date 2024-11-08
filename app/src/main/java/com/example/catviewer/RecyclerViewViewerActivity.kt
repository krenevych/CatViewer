package com.example.catviewer

import android.os.Bundle
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catviewer.databinding.ActivityRadioViewerBinding
import com.example.catviewer.databinding.ActivityRecyclerViewerBinding

class RecyclerViewViewerActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityRecyclerViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRecyclerViewerBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnRelaxed.setOnCheckedChangeListener(this)
        binding.btnSitting.setOnCheckedChangeListener(this)
        binding.btnJumping.setOnCheckedChangeListener(this)

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        if (!isChecked) return

        val res = when (buttonView) {
            binding.btnRelaxed -> R.drawable.cat_relaxed
            binding.btnSitting -> R.drawable.cat_sitting
            binding.btnJumping -> R.drawable.cat_jumping
            else -> R.drawable.cat_relaxed
        }

        binding.imageViewCat.setImageResource(res)

    }
}