package com.fastcat.winsun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fastcat.winsun.utils.ViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_main.view.*

class MainActivity : AppCompatActivity() {
    lateinit var listData: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listData = resources.getStringArray(R.array.classic_sort)

        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = Adapter()
        ll_base_info.setOnClickListener {
            startActivity(Intent(this, BasicAlgorithmInfoActivity::class.java))
        }
    }


    inner class Adapter : RecyclerView.Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(LayoutInflater.from(this@MainActivity).inflate(R.layout.item_main, parent, false))
        }

        override fun getItemCount(): Int {
            return listData.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.itemView.tv_name.text = listData[position]

            holder.itemView.setOnClickListener {
                val intent = Intent(this@MainActivity, AlgorithmDisplayActivity::class.java)
                intent.putExtra("title", listData[position])
                startActivity(intent)
            }
        }
    }


}
