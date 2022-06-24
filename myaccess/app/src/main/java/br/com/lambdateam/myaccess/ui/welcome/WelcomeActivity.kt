package br.com.lambdateam.myaccess.ui.welcome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.lambdateam.myaccess.databinding.ActivityWelcomeBinding
import br.com.lambdateam.myaccess.domain.User
import br.com.lambdateam.myaccess.ui.statement.PasswordStatementActivity

class WelcomeActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btContinue.setOnClickListener {
            val userId = binding.etAccountHolderId.text.toString().toLong()
            val user = User(userId)

            //Abaixo estamos criando uma intenção de redirecionamento para a PaswordActivity, que espera o ID para funcionar
            val intent = Intent(this, PasswordStatementActivity::class.java).apply {
                putExtra(PasswordStatementActivity.EXTRA_USER, user)
            }
            startActivity(intent)
        }
    }
}