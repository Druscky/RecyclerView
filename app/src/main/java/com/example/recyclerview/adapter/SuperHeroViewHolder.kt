package com.example.recyclerview.adapter

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.R
import com.example.recyclerview.SuperHero
import com.example.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder (view:View):RecyclerView.ViewHolder(view) {
    val b = ItemSuperheroBinding.bind(view)
    fun render(superHeroModel: SuperHero){
        b.tvHeroName.text = superHeroModel.superhero
        b.tvHeroRealName.text = superHeroModel.realName
        b.tvHeroPublisher.text = superHeroModel.publisher
        Glide.with(b.ivHero.context)
            .load(superHeroModel.photo)
            .error(R.drawable.error)
            .into(b.ivHero)
        b.ivHero.setOnClickListener {
            Toast.makeText(b.ivHero.context, superHeroModel.realName,Toast.LENGTH_SHORT).show()
        }
        itemView.setOnClickListener {
            Toast.makeText(b.ivHero.context, superHeroModel.superhero,Toast.LENGTH_SHORT).show()
        }
    }
}