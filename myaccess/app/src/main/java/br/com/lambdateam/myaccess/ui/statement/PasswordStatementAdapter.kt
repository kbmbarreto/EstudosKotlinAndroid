package br.com.lambdateam.myaccess.ui.statement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.lambdateam.myaccess.R
import br.com.lambdateam.myaccess.databinding.PasswordStatementItemBinding
import br.com.lambdateam.myaccess.domain.Password

/**
 * Reference: https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=pt-br#kotlin
 */
class PasswordStatementAdapter(private val dataSet: List<Password>) : RecyclerView.Adapter<PasswordStatementAdapter.ViewHolder>() {

    class ViewHolder(private val binding: PasswordStatementItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Password) = with(binding) {
            tvDescription.text = item.description
            tvUrl.text = item.url
            tvUsername.text = item.userName
            tvPassword.text = item.password
            tvNotes.text = item.notes
            val typeIcon = R.drawable.ic_register_in
            ivIcon.setImageResource(typeIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PasswordStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}