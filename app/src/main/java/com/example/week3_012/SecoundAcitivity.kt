package com.example.week3_012

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecoundAcitivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("OMG!!")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var age = intent.extras?.getString(MainActivity().TAG_AGE)
        var birthday = intent.extras?.getString(MainActivity().TAG_BIRTHDAY)
        var number = intent.extras?.getString(MainActivity().TAG_NUMBER)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_age.setText(age)
        tv_res_birthday.setText(birthday)
        tv_res_number.setText(number)

        btn_back.setOnClickListener {

            finish()

        }

    }
}