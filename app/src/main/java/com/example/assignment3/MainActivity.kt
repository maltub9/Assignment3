package com.example.assignment3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.marginTop
import androidx.core.view.setMargins
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var table = findViewById<TableLayout>(R.id.tableLayout1)
        var et1=EditText(applicationContext)
        et1.hint="Enter Android Version"

        var et2=EditText(applicationContext)
        et2.hint="Enter Android Code Name"

        var button1 = Button(applicationContext)
        button1.text="Add"
        val params = TableRow.LayoutParams(50,TableRow.LayoutParams.WRAP_CONTENT)
        params.setMargins(20,20,20,20)



        button1.setOnClickListener{
            val tr = TableRow(applicationContext)

            var tv1 = TextView(applicationContext)
            var tv2 = TextView(applicationContext)

            tv1.width= table.width/2
            tv2.width= table.width/2

            tr.setBackgroundColor(Color.parseColor("#d42671"))


            tv1.text=et1.text
            tv2.text=et2.text

            tr.addView(tv1,0)
            tr.addView(tv2,1)

            tr.setLayoutParams(params)


            table.addView(tr)
        }


        table.addView(et1)
        table.addView(et2)
        table.addView(button1)

        var tr = TableRow(applicationContext)

        var tv1 = TextView(applicationContext)
        var tv2 = TextView(applicationContext)

        tv1.width= table.width/2
        tv2.width= table.width/2

        tr.setBackgroundColor(Color.parseColor("#d42671"))


        tv1.text="android"
        tv2.text="v 1.3"

        tr.addView(tv1,0)
        tr.addView(tv2,1)

        tr.setLayoutParams(params)


        table.addView(tr)

        tr = TableRow(applicationContext)

        tv1 = TextView(applicationContext)
        tv2 = TextView(applicationContext)

        tv1.width= table.width/2
        tv2.width= table.width/2

        tr.setBackgroundColor(Color.parseColor("#d42671"))


        tv1.text="android"
        tv2.text="v 1.3"

        tr.addView(tv1,0)
        tr.addView(tv2,1)

        tr.setLayoutParams(params)


        table.addView(tr,params)

    }
}