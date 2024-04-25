package com.example.assignment4contentapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(var array: MutableList<contact>) : RecyclerView.Adapter<customAdapter.AlVH>() {


    class AlVH(p: View) : RecyclerView.ViewHolder(p) {


        val text1 = p.findViewById<TextView>(R.id.Tv1)

        val text2 = p.findViewById<TextView>(R.id.Tv2)


        val text3 = p.findViewById<TextView>(R.id.Tv3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlVH {

        var Cview = LayoutInflater.from(parent.context).inflate(R.layout.custom_design, null, false)

        return AlVH(Cview)

    }

    override fun getItemCount(): Int = array.size


    override fun onBindViewHolder(holder: AlVH, position: Int) {

        var element = array.get(position)

        holder.text1.text = element.name


        holder.text2.text = element.phone


        holder.text3.text = element.description

holder.itemView.setOnClickListener{

Rfrominterface?.onclickelemnt(element)

}






    }



    interface onclickitem{
        fun onclickelemnt(element:contact)
    }

      var Rfrominterface:onclickitem?=null

}