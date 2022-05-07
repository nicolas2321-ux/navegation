package com.portillo.portilloramirezkarlamarcelaapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val ayuda = ""
    val sabor = MutableLiveData("")
    val cantidad = MutableLiveData("")

    fun sabor (ayuda:String){
        if(ayuda.equals("fresa")){
            sabor.value = "fresa"
        }
    }
}