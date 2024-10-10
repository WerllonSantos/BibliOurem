package com.example.bibliourem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Define o layout da tela de login

        // Encontrar o botão "Iniciar Sessão"
        val btnIniciarSessao = findViewById<Button>(R.id.iniciar)
        btnIniciarSessao.setOnClickListener {
            // Trocar o fragmento atual pelo InicioFragment
            loadFragment(InicioFragment())
        }

        // Encontrar o botão "Cadastre-se"
        val btnCadastro = findViewById<Button>(R.id.btnCadastro)
        btnCadastro.setOnClickListener {
            // Criar a intenção para abrir a página de cadastro (CadastroActivity)
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent) // Inicia a nova Activity (CadastroActivity)
        }
    }

    // Função para carregar o fragmento
    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment) // Certifique-se de que você tem um FrameLayout com este ID
        transaction.addToBackStack(null) // Adiciona à pilha de navegação, caso queira voltar
        transaction.commit()
    }
}
