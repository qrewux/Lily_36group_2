package com.example.application2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.application2.databinding.ItemBooksBinding

class FirstAdapter(val onClick: (model: Book, position: Int) -> Unit,):RecyclerView.Adapter<FirstAdapter.BookViewHolder>() {
    private val list=ArrayList<Book>()
    //val onClick: (model: Book, position: Int) -> Unit,

    inner class BookViewHolder(val binding: ItemBooksBinding): RecyclerView.ViewHolder(binding.root){

        fun bindView(book: Book, position: Int){

            binding.bookTitle.text=book.title
            binding.bookAuthor.text=book.author


            Glide.with(binding.iv.context)
                .load(book.image)
                .into(binding.iv)

            binding.bookInfo.setOnClickListener {
                onClick(book,position)
                val navController = binding.root.findNavController()
                val bundle = Bundle()
                bundle.putString("Title", "Book Title: ${book.title}")
                bundle.putString("Author", "Author: ${book.author}")
                bundle.putString("Genre", "Genre: ${book.genre}")
                bundle.putString("Year", "Year: ${book.year}")
                bundle.putString("Summary", "Short summary: ${book.shortsummary}")
                navController.navigate(R.id.firstToSecond, bundle)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view=ItemBooksBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
       val book=list[position]
        holder.bindView(book,position)
    }

    fun setNewData(newList: List<Book>){
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()
    }


}