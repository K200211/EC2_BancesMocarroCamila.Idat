package com.camila.ec2_bancescamila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camila.ec2_bancescamila.databinding.ActivityLoginBinding
import com.camila.ec2_bancescamila.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCamara.setOnClickListener {
            val intent= Intent(this,Camera::class.java)
            startActivity(intent)
        }
        binding.btnMapa.setOnClickListener {
            val intent= Intent(this,MapActivity::class.java)
            startActivity(intent)
        }
    }
}