package com.tutkuozbakir.recyclerviewtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tutkuozbakir.recyclerviewtemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var ballList = ArrayList<Ball>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ballList.add(Ball("Red",R.drawable.red))
        ballList.add(Ball("Blue",R.drawable.blue))
        ballList.add(Ball("Purple",R.drawable.purple))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = BallAdapter(ballList)
        binding.recyclerView.adapter = adapter

    }
}