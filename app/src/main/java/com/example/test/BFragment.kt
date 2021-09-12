package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_b, container, false)

        //val personName = arguments?.getString("name")
        val tvName : TextView = view.findViewById(R.id.tvName)
        //tvName.text = personName

        //safe args passing
        val args = BFragmentArgs.fromBundle(requireArguments())
        tvName.text = args.name

        return view
    }


}