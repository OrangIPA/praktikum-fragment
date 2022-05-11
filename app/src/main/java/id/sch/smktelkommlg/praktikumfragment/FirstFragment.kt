package id.sch.smktelkommlg.praktikumfragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProvider(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<EditText>(R.id.nama)
        val alamatEditText = view.findViewById<EditText>(R.id.alamat)
        val noTelpEditText = view.findViewById<EditText>(R.id.noTelp)
        nameEditText.addTextChangedListener(
            object: TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    communicationViewModel!!.setName(p0.toString())
//                    communicationViewModel!!.setAlamat(p0.toString())
//                    communicationViewModel!!.setNoTelp(p0.toString())
                }

                override fun afterTextChanged(p0: Editable?) {}
            }
        )
        alamatEditText.addTextChangedListener(
            object: TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                    communicationViewModel!!.setName(p0.toString())
                    communicationViewModel!!.setAlamat(p0.toString())
//                    communicationViewModel!!.setNoTelp(p0.toString())
                }

                override fun afterTextChanged(p0: Editable?) {}
            }
        )
        noTelpEditText.addTextChangedListener(
            object: TextWatcher{
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                    communicationViewModel!!.setName(p0.toString())
//                    communicationViewModel!!.setAlamat(p0.toString())
                    communicationViewModel!!.setNoTelp(p0.toString())
                }

                override fun afterTextChanged(p0: Editable?) {}
            }
        )
    }

    companion object {
        fun newInstance(): FirstFragment{
            return FirstFragment()
        }
    }
}