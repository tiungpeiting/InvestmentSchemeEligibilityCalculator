package com.example.investmentschemeeligibilitycalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val c: Calendar = Calendar.getInstance();
    val mYear = c.get(Calendar.YEAR);
    val mMonth = c.get(Calendar.MONTH);
    val mDay = c.get(Calendar.DAY_OF_MONTH);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtDate.setOnClickListener {

            val datePickerDialog = DatePickerDialog(
                this,
                //to set result when ok is clicked
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    txtDate.setText(
                        dayOfMonth.toString() + "-" +
                                (month + 1) + "-" + year
                    )

                }, mYear, mMonth, mDay
             
            )

            datePickerDialog.show()

        }

       btnCalculate.setOnClickListener {
           val currentDate: Calendar = Calendar.getInstance();
           val DOB = currentDate.get(Calendar.YEAR) - mYear;
           txtAge.setText(DOB.toString())
       }
    }


}





