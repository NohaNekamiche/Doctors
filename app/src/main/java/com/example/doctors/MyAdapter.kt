package com.example.doctors

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
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
        val lat=data[position].lat
        val lang=data[position].lang
        holder.location.setOnClickListener{ view->
            val url=Uri.parse("geo:$lat,$lang")
            val intent= Intent(Intent.ACTION_VIEW,url)
            context.startActivity(intent)
        }
        val doc=data[position]
        holder.doc.setOnClickListener { v->
            val intent=Intent(context,InfoDoctor::class.java).apply {
              putExtra("doctor",doc)

            }
            context.startActivity(intent)
        }
    }

}


class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nom= view.findViewById<TextView>(R.id.textViewNom) as TextView
    val prenom= view.findViewById<TextView>(R.id.textViewPrenom) as TextView
    val num= view.findViewById<TextView>(R.id.textViewNum) as TextView
    val spec= view.findViewById<TextView>(R.id.textViewSpecialite) as TextView
    val img= view.findViewById<ImageView>(R.id.imageView) as ImageView
    val location =view.findViewById<ImageView>(R.id.loc) as ImageView
    val doc=view.findViewById<ConstraintLayout>(R.id.doc)
}