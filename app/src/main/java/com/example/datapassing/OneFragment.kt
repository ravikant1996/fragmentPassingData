package com.example.datapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation

class OneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val msg: EditText = view.findViewById(R.id.textMessage)
        val btn: Button = view.findViewById(R.id.send)

        btn.setOnClickListener {
            if (msg.text.isNotEmpty()) {

                //@todo first method
                val action =
                    OneFragmentDirections.actionOneFragmentToTwoFragment(msg.text.toString())
                Navigation.findNavController(view).navigate(action)

//                @todo second method
//                val bundle=Bundle()
//                bundle.putString("value", msg.text.toString())
//                Navigation.findNavController(view).navigate(R.id.action_oneFragment_to_twoFragment, bundle)
            } else {
                Toast.makeText(activity, "Please enter message", Toast.LENGTH_SHORT).show()
            }
        }

    }

}