package com.example.infoguate

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        commentEditText = findViewById(R.id.commentEditText)
        comment = findViewById(R.id.commentButton)

        comment.setOnClickListener{
            val commentText: String = commentEditText.text.toString()
            Toast.makeText(this,commentText, Toast.LENGHT_LONG).show()

            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var intent=intent
        val in = intent.fo
        if(in!=null){
            val NomLug =in .get("lugar") as String
            NomL.text = NomLug

            val inf =in .get("Info") as String
            i.text = inf
        }
    }
}