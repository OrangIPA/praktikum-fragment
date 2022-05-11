package id.sch.smktelkommlg.praktikumfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class SecondFragment : Fragment() {
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null
    private var txtNoTelp: TextView? = null
    private var txtAlamat: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProvider(requireActivity()).get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.namaRight)
        communicationViewModel!!.name.observe(requireActivity(), Observer { s -> txtName!!.text = s })
        txtNoTelp = view.findViewById(R.id.noTelpRight)
        communicationViewModel!!.noTelp.observe(requireActivity(), Observer { s -> txtNoTelp!!.text = s })
        txtAlamat = view.findViewById(R.id.alamatRight)
        communicationViewModel!!.alamat.observe(requireActivity(), Observer { s -> txtAlamat!!.text = s })
    }

    companion object {
        fun newInstance(): SecondFragment{
            return SecondFragment()
        }
    }
}