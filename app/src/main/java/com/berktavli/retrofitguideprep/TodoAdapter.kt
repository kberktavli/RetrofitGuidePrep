package com.berktavli.retrofitguideprep

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.berktavli.retrofitguideprep.databinding.ItemTodoBinding

class TodoAdapter : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    inner class TodoViewHolder(val binding : ItemTodoBinding): RecyclerView.ViewHolder(binding.root)
    private val diffCallback = object : DiffUtil.ItemCallback<Todo>() {
        override fun areItemsTheSame(oldItem: Todo, newItem: Todo): Boolean {
            return oldItem.id == newItem.id
            //benzersiz bir kimliğe (ID) sahip öğeleri karşılaştırarak öğelerin aynı olup olmadığını kontrol edebilirsiniz.
        }

        override fun areContentsTheSame(oldItem: Todo, newItem: Todo): Boolean {
            return oldItem == newItem
            // iki öğenin içeriğinin aynı olup olmadığını kontrol eder. Eğer areItemsTheSame tarafından true döndürüldüyse,
            // bu yöntem öğelerin içeriklerinin (örneğin, metin, tarih veya diğer veriler) aynı olup olmadığını kontrol eder.
        }
    }

    private val differ = AsyncListDiffer(this,diffCallback)
    var todos: List<Todo>
        get() = differ.currentList
        set(value){differ.submitList(value)}

    override fun getItemCount(): Int = todos.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(ItemTodoBinding.inflate(
            LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            val todo = todos[position]
            tvTitle.text = todo.title
            cbDone.isChecked = todo.completed

        }
    }
}