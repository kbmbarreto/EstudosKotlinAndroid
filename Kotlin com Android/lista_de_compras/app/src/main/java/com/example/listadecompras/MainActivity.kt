package com.example.listadecompras

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

        //definição do ouvinte do botão
        btn_inserir.setOnClickListener {
            //pegando o valor digitado pelo usuário
            val produto = txt_produto.text.toString()

            //verificando se o usuário digitou algum valor
            if (produto.isNotEmpty()) {
                //enviado o item para a lista
                produtosAdapter.add(produto)

                //limpando a caixa de texto
                txt_produto.text.clear()
            }else{
                txt_produto.error = "Preencha um valor"
            }

            list_view_produtos.setOnItemLongClickListener{ adapterView: AdapterView<*>, view: View, position: Int, id: Long ->
                //buscando o item clicado
                val item = produtosAdapter.getItem(position)
                //removendo o item clicado da lista
                produtosAdapter.remove(item)
                //retorno indicando que o click foi realizado com sucesso
                true
            }
        }
    }
}