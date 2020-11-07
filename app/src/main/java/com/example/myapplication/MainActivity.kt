package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.content_main.*


data class ImageItem(val count: Int)

class MainActivity : AppCompatActivity() {

    val imageItems = listOf(ImageItem(1), ImageItem(2), ImageItem(3), ImageItem(4), ImageItem(5))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ImagesAdapter(imageItems)
        val dividerItemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(dividerItemDecoration)
    }

    class ImagesAdapter(val imageItems: List<ImageItem>): RecyclerView.Adapter<ViewHolder>() {

        override fun getItemCount(): Int {
            return imageItems.size
        }

        override fun getItemViewType(position: Int): Int {
            return imageItems[position].count
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val resource = when (viewType){
                1 -> R.layout.image_item_1
                2 -> R.layout.image_item_2
                3 -> R.layout.image_item_3
                4 -> R.layout.image_item_4
                else -> R.layout.image_item_5
            }
            val view = LayoutInflater.from(parent.context).inflate(resource, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            // TODO
        }

    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }
}
