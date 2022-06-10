package com.example.spinnerclass

import android.appwidget.AppWidgetHostView
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.spinnerclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    private val spnOpt = arrayOf("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        val arrLenguajes = arrayOf("Python", "C++", "Java", "Kotlin", "PHP", "Eiffel", "Pascal", "Basic")
        GetSpinner(this,b.spinner, spnOpt, R.array.etiquetas)
        GetSpinner(this,b.spinner2, spnOpt, arrLenguajes)
    }
    fun clickButton1 (view: View){
        msj(this, spnOpt[0])
    }

    fun msj (context: Context, str:String, lengthLong:Boolean = true){
        Toast.makeText(context, str,
            if (lengthLong) Toast.LENGTH_LONG
            else Toast.LENGTH_SHORT
        ).show()
    }
}