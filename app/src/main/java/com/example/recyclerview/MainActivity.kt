package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.SuperHeroAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        //Coloca cada item en una rejilla
        //val manager = GridLayoutManager(this, 2)
        val decoration = DividerItemDecoration(this, manager.orientation)
        b.recyclerSuperHero.layoutManager = manager
        b.recyclerSuperHero.addItemDecoration(decoration)
        b.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        b.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)

    }

}