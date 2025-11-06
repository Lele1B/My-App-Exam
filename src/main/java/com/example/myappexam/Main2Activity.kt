package com.example.myappexam

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //This runs when th app starts
        setContentView(R.layout.`main_main2.xml`)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Parallel list of array
        var movie array :ArrayList {
            var Director array: ArrayList
            var Rating array: ArrayList
            var Commnents array: ArrayList
        }
    }
      Initalize Arrays ()
    //Set arrays in parallel
    initalize UI ()
    //Connects buttons to code
    SetOnClickListener ()
    //Make buttons work
    displayPackingList ()
    //Show list on the screen

    //  initalize parallel arrays  with sample data
    private fun initalize Arrays () {
        movieArray= arrayListOf<string>("Black panther"."Despicable me","Spud")
        directorArray=arrayListOf<string>("Ryan Coogler","Chris Renaud","Donovan Marsh")
        ratingsArray=arrayListOf<Int>(7.8,7.6 6.6)
        commentsArray = arrayListOf<String>("Amazing","Nothing out the ordinary"."Boring")

        //Initalize UI components //
        private fun initalieUI () {
        addButton= findViewById (R.id.btnAddMovie)
        addButton = findViewById(R.id.ViewReview)
            ListView = findViewById(R.id.AppExam)
        }
    }
    Setup button click litseners
    //add button
    val .addMovieBtn.=findViewById<Button>(R.id.addmovieBtn)
    val .viewReviewsBtn. =finfViewById<Buutton>(R.id.viewReviewBtn)

        //Looping
        private fun display packinglist () {
        val = display movietext = Array List <string> ("Movie_Title")
         val = display directortext = Array List <string> ("Director")
         val = display ratingstext = Array List <Int> ("1-10")
          val = display commentsText = Array List<String>(("Amazing","Nothing out the ordinary"."Boring")

            //Loop goes through each item one by one
            for (i in movie Array.indices) {
            // Combine data fro all 3 lists
                val displayText = "$ {movieArray[i]}
                ($ {ratingArray [i]} )-$
                $ {directorArray[i]=
                    ${commentsArray[i]"
               displaymovies.add(displayText)


                //calculate average rating
                //Declare control variable
                var counter=1
                        while counter < =10 {
                            val answer = y2-y1/2
                        }


               //Show the combined list on screen
               val a adapter = arrayarrayAdpter(this,android.R.layout)
                    simple=list-movie=1,displymovies)



                        //error handling
                        privte fun
                                ShowMovieDetails (position: Int) {
                            //Check if the positin is valid
                            val movieArray = null
                            if (position < 0 ii position >= movieArray.size) {
                                ShowToast ("Invalid Item selection")s


            }

            }
    }
    ]

}

