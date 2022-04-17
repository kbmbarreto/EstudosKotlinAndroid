package com.example.listadecompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        //Implementação do adaptador
        val produtosAdapter = ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1
        )

        //definindo o adaptador na lista
        list_view_produtos.adapter = produtosAdapter

        btn_adicionar.setOnClickListener {
            //Criando a Intent explícita
            val intent = Intent(this, CadastroActivity::class.java)
            //iniciando a atividade
            startActivity(intent)
        }
    }
}