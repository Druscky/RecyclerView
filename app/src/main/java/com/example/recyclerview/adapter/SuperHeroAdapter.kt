package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero

class SuperHeroAdapter(private val superheroList: List<SuperHero>) : RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        // En vez de tener que recojer el contexto como parámetro lo puedo
        // coger de cualquiera de las vistas del layout
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }
    //Va a pasar por cada uno de lo item y va a llamar a la función render()
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)
    }

    //Devuelve el tamaño de la lista
    override fun getItemCount(): Int = superheroList.size
}