package br.com.lambdateam.myaccess.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.lambdateam.myaccess.data.State
import br.com.lambdateam.myaccess.databinding.ActivityPasswordBinding
import br.com.lambdateam.myaccess.domain.Password
import br.com.lambdateam.myaccess.domain.User
import com.google.android.material.snackbar.Snackbar

class PasswordStatementActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "br.com.lambdateam.myaccess.ui.statement.EXTRA_USER"
    }

    private val binding by lazy {
        ActivityPasswordBinding.inflate(layoutInflater)
    }

    private val user by lazy {
        intent.getParcelableExtra<User>(EXTRA_USER) ?: throw IllegalArgumentException()
    }

    private val viewModel by viewModels<PasswordStatementViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvPasswordStatement.layoutManager = LinearLayoutManager(this)

        findPasswordStatement()

        //Swipe refresh da tela de senhas
        binding.srlPasswordStatement.setOnRefreshListener { findPasswordStatement() }

    }

    private fun findPasswordStatement() {
//        val dataSet = ArrayList<Password>()
//        dataSet.add(Password(1, "XP Investimentos", "https://xpinvestimentos.com.br", "teste.teste", "Teste2000@", "Chave de seguranca: XPTO000001", 1))
//        dataSet.add(Password(1, "Banco Santander", "https://santander.com.br", "123456", "09090909", "Chave de seguranca: XPTO000001", 1))
//        dataSet.add(Password(1, "Google", "https://google.com", "teste.teste", "Teste2000@", "", 1))
//        binding.rvPasswordStatement.adapter = PasswordStatementAdapter(dataSet)

        viewModel.findPasswordStatement(user.id).observe(this) {
            state ->
            when(state) {
                is State.Success -> {
                    binding.rvPasswordStatement.adapter = state.data?.let { PasswordStatementAdapter(it) }
                    binding.srlPasswordStatement.isRefreshing = false
                }
                is State.Error -> {
                    state.message?.let { Snackbar.make(binding.rvPasswordStatement, it, Snackbar.LENGTH_LONG).show() }
                    binding.srlPasswordStatement.isRefreshing = false
                }
                is State.Wait -> binding.srlPasswordStatement.isRefreshing = true
            }
        }
    }
}