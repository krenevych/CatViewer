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

//    0. Додаємо RecyclerView як View у розмітку
//    1 Створюємо клас даних ...Item.. для відображення одного елементу списку.
//    2. Створюємо ViewHolder - обʼєкт, що зображує однин елемент списку (для кожного типу елементів свій)
//    3. Створюємо адаптер, щоб обʼєднує дані і візуальну частину


    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRecyclerViewerBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

}