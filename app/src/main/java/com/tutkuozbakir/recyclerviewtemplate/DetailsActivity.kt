package com.tutkuozbakir.recyclerviewtemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutkuozbakir.recyclerviewtemplate.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedBall = intent.getSerializableExtra("Ball") as Ball
        binding.imageView.setImageResource(selectedBall.image)
        binding.textView.text = selectedBall.color
    }
}