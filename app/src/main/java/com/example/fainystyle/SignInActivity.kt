package com.example.fainystyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fainystyle.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtToSignUp.setOnClickListener {
            startActivity(
                Intent(this, SignUpActivity::class.java)

            )

        }
        binding.btnBackSignIn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}