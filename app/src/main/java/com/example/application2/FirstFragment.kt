package com.example.application2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.application2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var adapter: FirstAdapter
    lateinit var binding: FragmentFirstBinding
    val navController by lazy { findNavController() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv=requireActivity().findViewById<RecyclerView>(R.id.rv)
        adapter= FirstAdapter{model: Book, position: Int ->  }
        adapter.setNewData(createBooks())
        rv.adapter=adapter

    }

}