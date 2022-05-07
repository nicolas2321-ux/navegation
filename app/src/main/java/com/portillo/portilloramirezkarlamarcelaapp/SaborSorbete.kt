package com.portillo.portilloramirezkarlamarcelaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.portillo.portilloramirezkarlamarcelaapp.databinding.FragmentSaborSorbeteBinding


class SaborSorbete : Fragment() {
    lateinit var nav: NavController

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var binding: FragmentSaborSorbeteBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        nav = view.findNavController()
        binding.helado = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        super.onViewCreated(view, savedInstanceState)
        binding.button3.setOnClickListener{

           val action = SaborSorbeteDirections.actionSaborSorbete3ToFinishFragment()
            nav.navigate(action)
        }
        binding.fresa.setOnClickListener{
                viewModel.sabor("fresa")
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sabor_sorbete, container, false)

        return binding.root
    }
}