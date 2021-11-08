package com.example.hw_product_recycleview.smartPhone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.data_model

class Smart_phone_adapter(var context: Context, var datasource:List<data_model>) :
    RecyclerView.Adapter<Smart_phone_adapter.smart_phone> () {

    class smart_phone(val view: View): RecyclerView.ViewHolder(view){
        val button_id: Button =view.findViewById(R.id.button_id)
        //the erorr is can not cost the Text View into Image View
        val icon_id:ImageView= view.findViewById(R.id.icon_id)
        val textdown_id:TextView=view.findViewById(R.id.textdown_id)
        val textup_id:TextView=view.findViewById(R.id.textup_id)
        val image_id:ImageView=view.findViewById(R.id.image_id)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): smart_phone {
        return smart_phone(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: smart_phone, position: Int) {
        val item = datasource[position]
        Toast.makeText(context, "${item.price}", Toast.LENGTH_SHORT).show()
       holder.icon_id.isVisible = if (item.isVip) true else false
        holder.textdown_id.setText(item.price.toString())
        holder.textup_id.text = item.name
        holder.image_id.setImageResource(item.image)
        holder.button_id.apply {
            isClickable
        }
    }

    override fun getItemCount(): Int {
       return datasource.size
    }
}



