package com.example.bibliourem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Certifique-se de que esta função está implementada
        setContentView(R.layout.activity_login)

        // Ajusta as margens de acordo com as barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Intent para abrir a tela de cadastro
        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        btnCadastro.setOnClickListener {
            // Use a classe CadastroActivity para abrir a nova tela
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }
    }

    class CadastroActivity {

    }
}