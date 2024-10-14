package com.example.catviewer

import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatActivity
import com.example.catviewer.databinding.ActivityCheckBoxViewerBinding

class CheckBoxViewerActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    private lateinit var binding: ActivityCheckBoxViewerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCheckBoxViewerBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnRelaxed.setOnCheckedChangeListener(this)
        binding.btnSitting.setOnCheckedChangeListener(this)
        binding.btnJumping.setOnCheckedChangeListener(this)

    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {

        if (!isChecked){
            return
        }

        val res = when (buttonView) {
            binding.btnRelaxed -> {
//                binding.checkBoxRelaxed.isChecked = false
                binding.btnSitting.isChecked = false
                binding.btnJumping.isChecked = false
                R.drawable.cat_relaxed
            }
            binding.btnSitting -> {
                binding.btnRelaxed.isChecked = false
//                binding.checkBoxSitting.isChecked = false
                binding.btnJumping.isChecked = false
                R.drawable.cat_sitting
            }
            binding.btnJumping -> {
                binding.btnRelaxed.isChecked = false
                binding.btnSitting.isChecked = false
//                binding.checkBoxJumping.isChecked = false
                R.drawable.cat_jumping
            }
            else -> {R.drawable.cat_relaxed}
        }

        binding.imageViewCat.setImageResource(res)

    }
}