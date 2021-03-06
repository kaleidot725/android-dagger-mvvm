package kaleidot725.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kaleidot725.myapplication.model.WordGenerator
import javax.inject.Inject

class MainViewModel @Inject constructor(private val wordGenerator : WordGenerator) : ViewModel() {
    private val _word : MutableLiveData<String> = MutableLiveData()
    val word : LiveData<String> = _word

    fun generate() {
        val w = wordGenerator.generate()
        _word.postValue(w)
    }
}