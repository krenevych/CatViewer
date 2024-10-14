package com.example.catviewer

import android.os.Bundle
import android.widget.CompoundButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.catviewer.databinding.ActivityCheckBoxViewerBinding

class CheckBoxViewerActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityCheckBoxViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCheckBoxViewerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.checkBoxRelaxed.setOnCheckedChangeListener(this)
        binding.checkBoxSitting.setOnCheckedChangeListener(this)
        binding.checkBoxJumping.setOnCheckedChangeListener(this)

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        if (!isChecked){
            return
        }

        val res = when (buttonView) {
            binding.checkBoxRelaxed -> {
//                binding.checkBoxRelaxed.isChecked = false
                binding.checkBoxSitting.isChecked = false
                binding.checkBoxJumping.isChecked = false
                R.drawable.cat_relaxed
            }
            binding.checkBoxSitting -> {
                binding.checkBoxRelaxed.isChecked = false
//                binding.checkBoxSitting.isChecked = false
                binding.checkBoxJumping.isChecked = false
                R.drawable.cat_sitting
            }
            binding.checkBoxJumping -> {
                binding.checkBoxRelaxed.isChecked = false
                binding.checkBoxSitting.isChecked = false
//                binding.checkBoxJumping.isChecked = false
                R.drawable.cat_jumping
            }
            else -> {R.drawable.cat_relaxed}
        }

        binding.imageViewCat.setImageResource(res)

    }
}