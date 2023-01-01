package com.omery.superkahramankitabi

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*

class RecyclerAdapter(val kahramanLitesi : ArrayList<String>, val kahramanGorselleri : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        // Inflater, LayoutInflater, MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return SuperKahramanVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {
       holder.itemView.recyclerViewTextView.text = kahramanLitesi.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanLitesi.get(position))
            /*
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = kahramanGorselleri.get(position)
            */
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return kahramanLitesi.size
    }
}