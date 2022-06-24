package br.com.lambdateam.myaccess.ui.statement

import androidx.lifecycle.ViewModel
import br.com.lambdateam.myaccess.data.PasswordRepository

class PasswordStatementViewModel : ViewModel() {

    fun findPasswordStatement(accountHolderId: Long) =
        PasswordRepository.findPasswordStatement(accountHolderId)
}