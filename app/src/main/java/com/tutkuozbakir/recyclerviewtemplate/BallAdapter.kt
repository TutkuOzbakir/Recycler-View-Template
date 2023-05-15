package com.tutkuozbakir.recyclerviewtemplate

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tutkuozbakir.recyclerviewtemplate.databinding.RecyclerviewRowBinding

class BallAdapter(val ballList: ArrayList<Ball>): RecyclerView.Adapter<BallAdapter.BallViewHolder>() {

    class BallViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BallViewHolder {
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BallViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BallViewHolder, position: Int) {
        holder.binding.rowTextView.text = ballList.get(position).color

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("Ball",ballList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return ballList.size
    }
}