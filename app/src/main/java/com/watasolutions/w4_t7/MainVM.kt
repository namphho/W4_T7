package com.watasolutions.w4_t7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.watasolutions.w4_t7.model.Idol

class MainVM : ViewModel() {
    private var _listOfData: MutableLiveData<List<Idol>> = MutableLiveData()
    val listOfData: LiveData<List<Idol>>
        get() = _listOfData

    fun loadData() {
        val data = DataStore.getDataSet()
        _listOfData.postValue(data)
    }
}