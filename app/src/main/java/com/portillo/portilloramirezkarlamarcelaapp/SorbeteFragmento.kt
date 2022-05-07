package com.portillo.portilloramirezkarlamarcelaapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.portillo.portilloramirezkarlamarcelaapp.databinding.FragmentFinishBinding
import com.portillo.portilloramirezkarlamarcelaapp.databinding.FragmentSorbeteFragmentoBinding


class SorbeteFragmento : Fragment(R.layout.fragment_sorbete_fragmento) {
    // TODO: Rename and change types of parameters
    lateinit var nav : NavController
    private val viewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentSorbeteFragmentoBinding
    val numFragmento = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav = view.findNavController()
        binding.helados = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        binding.button2.setOnClickListener{

            val action = SorbeteFragmentoDirections.actionSorbeteFragmentoToSaborSorbete3()
            nav.navigate(action)


        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sorbete_fragmento, container, false)

        return binding.root
    }
}