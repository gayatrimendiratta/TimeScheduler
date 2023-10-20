package com.example.timescheduler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timescheduler.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Register_Activity : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityRegisterBinding.inflate(layoutInflater)

        setContentView(binding.root)
        auth=FirebaseAuth.getInstance()


        binding.btnRegister.setOnClickListener(){
            val email=binding.etEmail.text.toString()
            val pass=binding.etPassword.text.toString()
            auth.createUserWithEmailAndPassword(email,pass)
            startActivity(Intent(this,LoginActivity::class.java))

        }
        binding.HavenAcoount.setOnClickListener{
            startActivity(Intent(this,LoginActivity::class.java))
        }

       
    }


        // [END create_user_with_email]
    }
