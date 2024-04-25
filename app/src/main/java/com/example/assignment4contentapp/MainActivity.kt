package com.example.assignment4contentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.assignment4contentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var name: String

    lateinit var phone: String

    lateinit var description: String

    lateinit var myarray: MutableList<contact>
    lateinit var Adapter: customAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myarray = mutableListOf()
        initRecycleview()
        Button()
        Adapter.Rfrominterface = object : customAdapter.onclickitem {
            override fun onclickelemnt(element: contact) {


            }


        }


    }

    private fun initRecycleview() {
        Adapter = customAdapter(myarray)

        binding.recycle.adapter = Adapter
    }

    private fun Button() {

        binding.SaveB.setOnClickListener {
            name = binding.Nameinput1.text?.trim().toString()
            phone = binding.phoneinput2.text?.trim().toString()
            description = binding.Descriptioninput3.text?.trim().toString()

            if (checkAllfields() == false)
                return@setOnClickListener
            else {
                var contact = contact(name, phone, description)
                myarray.add(contact)
                Adapter.notifyItemChanged(myarray.size - 1)
            }


        }
    }


    fun checkAllfields(): Boolean {

        binding.Textlayout1.error = checkNametext(name)
        binding.Textlayout2.error = checkphonetext(phone)



        return checkNametext(name) == null && checkphonetext(phone) == null

    }


    fun checkNametext(Name: String): String? {

        if (Name.isNullOrEmpty()) return "Required"

        if (Name.trim().length < 10) return "The name is too small"
        return null

    }


    fun checkphonetext(phone: String): String? {

        if (phone.isNullOrEmpty()) return "Required"

        if (phone.trim().length < 11) return "The name is too small"
        return null

    }


}