package id.sch.smktelkommlg.praktikumfragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {
    private val nName = MutableLiveData<String>()
    val name: LiveData<String>
        get() = nName
    fun setName(name: String){
        nName.value = name
    }

    private val aAlamat = MutableLiveData<String>()
    val alamat: LiveData<String>
        get() = aAlamat
    fun setAlamat(alamat: String){
        aAlamat.value = alamat
    }

    private val nNoTelp = MutableLiveData<String>()
    val noTelp: LiveData<String>
        get() = nNoTelp
    fun setNoTelp(noTelp: String){
        nNoTelp.value = noTelp
    }
}