package com.example.myappexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.`splashcreen_main.xml`)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Creating the explicit intent
        val intent = Intent(mainscreeny_main2.xml:: class.java)
        //start the activity
        start activity intent
        //Transitioning

        var visible by remember {mutableStateof (true) }

        AnimatedVisibility( visible=visible,enter= fade in (),// exit =fadeout)
            overPendingTransition(0, R.anime_mainscreeny_main.xml)
    }
}