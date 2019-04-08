//Fatima Albeno, 18060
//Laboratorio 3, Plataformas moviles
package com.example.infoguate

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.view.View.INVISIBLE
import Modelos.Lugares
import Modelos.Nombre


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNombre: Nombre = Nombre("")
        nomVis.visibility = INVISIBLE

        val lu = Lugares()

        lugar1.setOnClickListener {
            val intent = intent(this, Main2Activity::class.java)
            lu.Lugares("Antigua")
            intent.putExtra("lugar", Lugares.getLugar())
            intent.putExtra("Info", Lugares.getInfo())
            startActivity(intent)
        }
        lugar2.setOnClickListener {
            val intent = intent(this, Main2Activity::class.java)
            lu.Lugares("Semuc")
            intent.putExtra("lugar", Lugares.getLugar())
            intent.putExtra("Info", Lugares.getInfo())
            startActivity(intent)
        }
        lugar3.setOnClickListener {
            val intent = intent(this, Main2Activity::class.java)
            lu.Lugares("Esquipulas")
            intent.putExtra("lugar", Lugares.getLugar())
            intent.putExtra("Info", Lugares.getInfo())
            startActivity(intent)
        }
        estrella.setOnClickListener {
            if (nombrelabel.visibility == View, VISIBLE){
            nombrelabel.visibility = INVISIBLE
            nombreedit.visibility = INVISIBLE
            editNombre.setNombre(nombreedit.text.toString())
        }
            else{
            nombrelabel.visibility = View.VISIBLE
            nombreedit.visibility = View.INVISIBLE
        }
            if (nomVis.visibility = View.VISIBLE) {
                nomVis.visibility = INVISIBLE
            } else {
                nomVis.visibility = View.VISIBLE
                nomVis.text = editNombre.getNombre()
            }
        }
    }
}
