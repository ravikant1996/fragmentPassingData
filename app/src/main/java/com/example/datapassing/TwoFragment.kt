package com.example.datapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.navArgs

class TwoFragment : Fragment() {

    private val args: TwoFragmentArgs by navArgs()
    private lateinit var value: String


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)

        val msgView: TextView = view.findViewById(R.id.message)
        //@todo first method
        msgView.text = args.message


        //@todo second method
        value = requireArguments().getString("value").toString()
        msgView.text = value
        Toast.makeText(activity, value, Toast.LENGTH_SHORT).show()
        return view
    }


}