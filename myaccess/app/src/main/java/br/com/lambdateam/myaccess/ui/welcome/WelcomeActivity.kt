package br.com.lambdateam.myaccess.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.lambdateam.myaccess.databinding.ActivityWelcomeBinding
import br.com.lambdateam.myaccess.domain.User
import br.com.lambdateam.myaccess.ui.statement.PasswordActivity

class WelcomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            val userId = binding.edtTxtUserId.text.toString().toLong()
            val user = User(userId)

            //Abaixo estamos criando uma intenção de redirecionamento para a PaswordActivity, que espera o ID para funcionar
            val intent = Intent(this, PasswordActivity::class.java).apply {
                putExtra(PasswordActivity.EXTRA_USER, user)
            }
            startActivity(intent)
        }
    }
}