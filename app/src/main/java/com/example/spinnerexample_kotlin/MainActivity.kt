package com.example.spinnerexample_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener


class MainActivity : AppCompatActivity() {

    var spinner:Spinner? = null
      var textView_msg:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var  languages = arrayOf("Item 1", "Item 2", "Item 3")
        setContentView(R.layout.activity_main)
        spinner=findViewById<Spinner>(R.id.spinner)

   // Create an ArrayAdapter using a simple spinner layout and languages array
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_item,  languages)
        // Set layout to use when the list of choices appear
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
          spinner!!.setAdapter(arrayAdapter)

          spinner!!.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                val selectedItem = parent.getItemAtPosition(position).toString()

                Toast.makeText(applicationContext,"Toasted $selectedItem",Toast.LENGTH_SHORT).show()


                    /*if (selectedItem == "Add new category") {
                    // do your stuff
                }*/
            } // to close the onItemSelected

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        })
        }




    }



