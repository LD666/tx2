package com.myfirstapplication.tx2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.view.*

class fragmentOne: Fragment(){

    var myInterface: myInterface? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        myInterface = activity as MainActivity

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_one, container, false)

        var myData =  view!!.fOneT1.text.toString()

        view.fOneB1.setOnClickListener(View.OnClickListener {


            var fragTwo = fragmentTwo()
            var myFrag = fragmentManager!!.beginTransaction()
            myFrag.replace(R.id.mainID, fragTwo).commit()

            //myInterface!!.myFun(myData)

        })

        return view

    }

}