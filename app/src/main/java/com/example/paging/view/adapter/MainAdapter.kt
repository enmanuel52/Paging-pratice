package com.example.paging.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.paging.R
import com.example.paging.data.model.Character
import com.example.paging.databinding.RecyclerLayoutBinding

class MainAdapter() : PagingDataAdapter<Character, MainAdapter.CharacterViewHolder>(ItemCallback) {
    val items: List<Character> = emptyList()
    inner class CharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = RecyclerLayoutBinding.bind(view)

        fun bind(){

        }
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recycler_layout, parent, false)
        return CharacterViewHolder(view!!)
    }
}

object ItemCallback : DiffUtil.ItemCallback<Character>() {
    override fun areItemsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Character, newItem: Character): Boolean {
        return oldItem.id == newItem.id
    }
}