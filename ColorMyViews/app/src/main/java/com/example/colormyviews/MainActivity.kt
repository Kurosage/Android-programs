package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val listId =
            listOf(R.id.box_one_text, R.id.box_two_text, R.id.box_three_text,
                R.id.box_four_text, R.id.box_five_text, R.id.constraint_layout,
                R.id.red_button, R.id.green_button, R.id.yellow_button)

        for (item in listId) {
            findViewById<View>(item).setOnClickListener { makeColored(it) }
        }
    }


    private fun makeColored(view: View) {
        val box_threef= R.id.box_three_text
        val box_fourf = R.id.box_four_text
        val box_fivef = R.id.box_five_text
        when (view.id) {

            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.red_button -> findViewById<View>(box_threef).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<View>(box_fourf).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View>(box_fivef).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}