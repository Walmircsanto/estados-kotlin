package com.jv.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadoAdapter(
    private val estados: List<Estado>,
    private val onClick: (Estado) -> Unit
) : RecyclerView.Adapter<EstadoAdapter.EstadoViewHolder>() {

    class EstadoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewBandeira: ImageView = itemView.findViewById(R.id.imageViewBandeira)
        val textViewNomeEstado: TextView = itemView.findViewById(R.id.textViewNomeEstado)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_estado, parent, false)
        return EstadoViewHolder(view)
    }

    override fun onBindViewHolder(holder: EstadoViewHolder, position: Int) {
        val estado = estados[position]
        holder.imageViewBandeira.setImageResource(estado.bandeiraResId)
        holder.textViewNomeEstado.text = estado.nome

        holder.itemView.setOnClickListener {
            onClick(estado)
        }
    }

    override fun getItemCount(): Int = estados.size
}