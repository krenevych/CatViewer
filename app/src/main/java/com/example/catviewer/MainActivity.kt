package com.example.catviewer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.catviewer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)

        viewBinding.btnCheckBox.setOnClickListener {
            val intent = Intent(this, CheckBoxViewerActivity::class.java)
            startActivity(intent)
        }
        viewBinding.btnRadio.setOnClickListener {
            val intent = Intent(this, RadioViewerActivity::class.java)
            startActivity(intent)
        }
        viewBinding.btnToggle.setOnClickListener {
            val intent = Intent(this, ToggleViewerActivity::class.java)
            startActivity(intent)
        }
        viewBinding.btnSpinner.setOnClickListener {
            val intent = Intent(this, SpinnerViewerActivity::class.java)
            startActivity(intent)
        }
    }
}