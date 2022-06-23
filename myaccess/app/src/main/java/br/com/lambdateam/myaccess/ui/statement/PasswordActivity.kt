package br.com.lambdateam.myaccess.ui.statement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.lambdateam.myaccess.R
import br.com.lambdateam.myaccess.databinding.ActivityPasswordBinding
import br.com.lambdateam.myaccess.databinding.ActivityWelcomeBinding
import br.com.lambdateam.myaccess.domain.User

class PasswordActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_USER = "br.com.lambdateam.myaccess.ui.statement.EXTRA_USER"
    }

    private val binding by lazy {
        ActivityPasswordBinding.inflate(layoutInflater)
    }

    private val user by lazy {
        intent.getParcelableExtra<User>(EXTRA_USER) ?: throw IllegalArgumentException()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.d("TESTE", "Chegou o ID: ${user.id}")
    }
}