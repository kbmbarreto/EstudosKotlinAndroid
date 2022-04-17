package com.example.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {
            //pegando o valor digitado pelo usuário
            val produto = txt_produto.text.toString()

            //verificando se o usuário digitou algum valor
            if (produto.isNotEmpty()) {
                //enviado o item para a lista


                //limpando a caixa de texto
                txt_produto.text.clear()
            }else{
                txt_produto.error = "Preencha um valor"
            }
        }
    }
}