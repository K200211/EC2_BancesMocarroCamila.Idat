package com.camila.ec2_bancescamila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.camila.ec2_bancescamila.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            Toast.makeText(this, "Abriendo formulario registro", Toast.LENGTH_SHORT).show()
        }

        binding.tilUser.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validarLogin(text.toString(), binding.tilPassword.editText?.text.toString())
        }
        binding.tilPassword.editText?.addTextChangedListener { text ->
            binding.btnLogin.isEnabled = validarLogin(binding.tilUser.editText?.text.toString(), text.toString())
        }
        binding.btnLogin.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }

    }

    private fun validarLogin(user:String, password:String): Boolean {
        val isUserok= user.equals("ejemplo@idat.edu.pe")
        val isPasswordOk= password.length >=6
        return isUserok && isPasswordOk
    }
}