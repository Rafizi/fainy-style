package com.example.fainystyle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fainystyle.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtToSignIn.setOnClickListener {
            startActivity(
                Intent(this, SignInActivity::class.java)

            )

        }

        binding.btnBackSignUp.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}