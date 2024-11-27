package com.personal.mx.motivational_app.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.personal.mx.motivational_app.databinding.ActivityMainBinding
import com.personal.mx.motivational_app.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels() // ViewModel instance

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observe LiveData from ViewModel
        viewModel.quote.observe(this) { quote ->
            binding.Phrase.text = "\"${quote.q}\"\n- ${quote.a}"
        }

        viewModel.error.observe(this) { errorMessage ->
            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
        }

        // Button click to fetch a new quote
        binding.btnPhr.setOnClickListener {
            viewModel.fetchQuote()
        }

        // Fetch the first quote on launch
        viewModel.fetchQuote()
    }
}
