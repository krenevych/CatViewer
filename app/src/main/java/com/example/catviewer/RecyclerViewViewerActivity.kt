package com.example.catviewer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.catviewer.databinding.ActivityRecyclerViewerBinding

class RecyclerViewViewerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewerBinding

//    0. Додаємо RecyclerView як View у розмітку
//    1. Створюємо клас даних ...Item.. для відображення одного елементу списку.
//    2. Створюємо ViewHolder - обʼєкт, що зображує однин елемент списку (для кожного типу елементів свій)
//    3. Створюємо адаптер, щоб обʼєднує дані і візуальну частину
//    4. Встановлюємо для нашого RecyclerView адаптер

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityRecyclerViewerBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerCat.layoutManager = LinearLayoutManager(this)
//        binding.recyclerCat.layoutManager = GridLayoutManager(this, 3)
        binding.recyclerCat.adapter = CatAdapter(dataSet).apply {
//            clickListener = object : CatAdapter.ClickListener {
//                override fun onClick(position: Int) {
//                    binding.imageCat.setImageResource(dataSet[position].resource)
//                }
//            }

            clickListener = CatAdapter.ClickListener { position: Int ->
                binding.imageCat.setImageResource(dataSet[position].resource)
            }

        }

    }

}