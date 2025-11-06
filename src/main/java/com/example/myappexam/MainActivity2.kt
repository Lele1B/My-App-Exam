package com.example.myappexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //This runs when app starts
        setContentView(R.layout.`detailedview_main3.xml`)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Parallel List array
        private lateinit var movie array : Array list ()
        private lateinit var director array: Array list ()
        private lateinit var  ratings array: Array list ()
        private lateinit var  comments array : Arry list ()

        Initalize Arrays ()
        //Set arrays in parallel
        initalize UI ()
        //Connects buttons to code
        SetOnClickListener ()
        //Make buttons work
        displayPackingList ()
        //Show list on the screen


        //Display a list of movies with details
        val myMovie: myMovie = findViewById<Text>(R.id.movieText)
        val myDirector: myDirector = findViewById<Text>(R.id.directorText)
    }   val myRatings: myRatings = findViewById<Text>(R.id.ratingsText)
}

//Get the new data user entered
val movieName = data.getStringExtra("Movie_Title")
val directorName = data.getSringExtra("Director")
val ratingsNumber = data.getNumExtra(1-10)


//Add to all 4 Lists (keeping them parallel)movieArray.add(movieName)
Add to items List displayPackingList()
        //Refresh the display

private fun setuplistener() {
    //when "back" is clicked//
    //add button
    val .backBtn. =findViewById<Buutton>(R.id.backBtn)
    backbtn.setOnClickListener {
    navigate To Main screen ()
    //Go to Main screen

    //When any list item is clicked //
    listView.SetOnMovieClickListener
    {parent,view,position,id}
    show Moviedetails (position)
    //Show details for that item

    //error handling
    privte fun
        ShowMovieDetails (position: Int) {
            //Check if the positin is valid
    val movieArray = null
    if (position < 0 ii position >= movieArray.size) {
                ShowToast ("Invalid Item selection")
        }

}
}