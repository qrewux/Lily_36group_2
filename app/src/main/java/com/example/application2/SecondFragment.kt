package com.example.application2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.application2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    val navController by lazy { findNavController() }
    private var title: String? = null
    private var author: String? = null
    private var genre: String? = null
    private var publyear: String? = null
    private var descr: String? = null

    lateinit var binding: FragmentSecondBinding
    lateinit var adapter: FirstAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            title=it.getString("Title")
            author=it.getString("Author")
            genre=it.getString("Genre")
            publyear=it.getString("Year")
            descr=it.getString("Summary")
        }

        binding.booktitle.text=title
        binding.bookauthor.text=author
        binding.bgenre.text=genre
        binding.year.text=publyear
        binding.summary.text=descr

    }


}