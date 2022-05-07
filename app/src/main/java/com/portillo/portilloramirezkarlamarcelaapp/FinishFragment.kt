package com.portillo.portilloramirezkarlamarcelaapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentResultListener
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.portillo.portilloramirezkarlamarcelaapp.databinding.FragmentFinishBinding

class FinishFragment : Fragment() {
    private lateinit var binding: FragmentFinishBinding

    private val viewModel: MainViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.sorbete = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_finish, container, false)

        return binding.root
    }


}