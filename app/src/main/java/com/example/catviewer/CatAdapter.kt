package com.example.catviewer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

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
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val catName: TextView
        val catImage: ImageView
        val catCardView: CardView

        init {
            // Define click listener for the ViewHolder's View
            catName = view.findViewById(R.id.nameCat)
            catImage = view.findViewById(R.id.imageCat)
            catCardView = view.findViewById(R.id.catCardView)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cat_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.catName.text = dataSet[position].name
        viewHolder.catImage.setImageResource(dataSet[position].resource)
        viewHolder.catCardView.setOnClickListener {
            clickListener?.onClick(position)
//            clickListener?.invoke(position)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}