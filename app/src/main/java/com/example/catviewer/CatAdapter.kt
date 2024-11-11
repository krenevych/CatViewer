package com.example.catviewer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.catviewer.databinding.CatItemBinding

class CatAdapter(private val dataSet: Array<ItemCat>) :
    RecyclerView.Adapter<CatAdapter.ViewHolder>() {

        fun interface ClickListener {
            fun onClick(position: Int)
        }

        var clickListener : ClickListener? = null
//        var clickListener : ( (position: Int) -> Unit )? = null

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(
        val binding: CatItemBinding
    ) : RecyclerView.ViewHolder(binding.root)

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
//        val view = LayoutInflater.from(viewGroup.context)
//            .inflate(R.layout.cat_item, viewGroup, false)

        // Create binding which contains view.
        val binding = CatItemBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )

        return ViewHolder(binding)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.binding.nameCat.text = dataSet[position].name
        viewHolder.binding.imageCat.setImageResource(dataSet[position].resource)
        viewHolder.binding.catCardView.setOnClickListener {
            clickListener?.onClick(position)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}