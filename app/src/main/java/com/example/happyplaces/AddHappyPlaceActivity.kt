package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar


class AddHappyPlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_happy_place)

        var toolbarAddHappyPlace : Toolbar = findViewById(R.id.toolbar_add_place)

        setSupportActionBar(toolbarAddHappyPlace)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbarAddHappyPlace.setNavigationOnClickListener{
            onBackPressed()
        }
    }
}