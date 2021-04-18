package com.example.doctors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val context: Context, var data:List<Doctor>): RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.doctor_element, parent, false))
    }

    override fun getItemCount()=data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.nom.text=data[position].nom
        holder.prenom.text=data[position].prenom
        holder.num.text=data[position].num
        holder.spec.text=data[position].speciality
        holder.img.setImageResource(data[position].img)

    }

}


class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nom= view.findViewById<TextView>(R.id.textViewNom) as TextView
    val prenom= view.findViewById<TextView>(R.id.textViewPrenom) as TextView
    val num= view.findViewById<TextView>(R.id.textViewNum) as TextView
    val spec= view.findViewById<TextView>(R.id.textViewSpecialite) as TextView
    val img= view.findViewById<ImageView>(R.id.imageView) as ImageView
}