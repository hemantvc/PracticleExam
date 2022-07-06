package org.hariom.practicleexam.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.hariom.practicleexam.R
import org.hariom.practicleexam.model.MyNumber

class NumberAdapter(private val numbers:List<MyNumber>)  : RecyclerView.Adapter<NumberAdapter.NumberViewHolder>() {


    class NumberViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val number = view.findViewById<TextView>(R.id.in_tvNumber)

        fun bind(item : MyNumber){
            number.text = item.number.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        // LayoutInflater converts xml file to java file
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_number,parent,false)
        return NumberViewHolder(view)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.number.text = numbers[position].number.toString()
    }

    override fun getItemCount(): Int {
       return numbers.size
    }

}
