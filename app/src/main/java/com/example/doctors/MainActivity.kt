package com.example.doctors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list_doc.layoutManager = LinearLayoutManager(this)
        list_doc.adapter = MyAdapter(this,loadData())
    }
    fun loadData():List<Doctor> {
        val data = mutableListOf<Doctor>()
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic1))
        data.add(Doctor("Selmane","Lamia","05554678","pediate",R.drawable.pic2))
        data.add(Doctor("Nekamiche","Souha","05554678","dentiste",R.drawable.pic3))
        data.add(Doctor("Nekamiche","Issam","05554678","dentiste",R.drawable.pic4))
        data.add(Doctor("Nekamiche","Abdelkader","05554678","dentiste",R.drawable.pic5))
        data.add(Doctor("Nekamiche","Halim","05554678","dentiste",R.drawable.pic6))
        data.add(Doctor("Kansab","Samah","05554678","dentiste",R.drawable.pic3))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic8))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic1))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic3))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic4))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic5))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic6))
        data.add(Doctor("Nekamiche","Noha","05554678","dentiste",R.drawable.pic7))
        return data
    }

}