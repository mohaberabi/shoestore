package com.example.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel : ViewModel() {

    private val _shoes: MutableLiveData<List<ShoeModel>> = MutableLiveData(ShoeConst.shoes)


    val shoes: LiveData<List<ShoeModel>>
        get() = _shoes

}