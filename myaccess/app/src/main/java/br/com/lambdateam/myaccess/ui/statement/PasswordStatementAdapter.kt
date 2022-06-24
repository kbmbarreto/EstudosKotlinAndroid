package br.com.lambdateam.myaccess.ui.statement

import android.content.Context
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

    class ViewHolder(private val binding: PasswordStatementItemBinding, private val context: Context) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Password) = with(binding) {
            tvDescription.text = item.description
            tvUrl.text = context.getString(R.string.url_value, item.url)
            tvUsername.text = context.getString(R.string.username_value, item.userName)
            tvPassword.text = context.getString(R.string.password_value, item.password)
            tvNotes.text = context.getString(R.string.notes_value, item.notes)
            val typeIcon = R.drawable.ic_baseline_list_24
            ivIcon.setImageResource(typeIcon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PasswordStatementItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val item = dataSet[position]
        viewHolder.bind(item)
    }

    override fun getItemCount() = dataSet.size
}