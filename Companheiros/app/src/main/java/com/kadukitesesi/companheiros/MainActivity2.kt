package com.kadukitesesi.companheiros

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.kadukitesesi.companheiros.companheiro.Companheiro

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        var companheiro1 =
            Companheiro("Jurandir", 56, "Gosta de rock e animais selvagens que são considerados reis")
        var companheiro2 =
            Companheiro("Carlos", 21, "Ama tecnologia e consoles retro, gosta de rap e sempre está sozinho")
        var companheiro3 =
            Companheiro("Adriana", 42, "Gosta de rock e de assistir filmes, ela gosta do trabalho que faz, trabalha com tecnologia")

        companheiro1.toString()
        companheiro2.toString()
        companheiro3.toString()

        val items = mutableListOf(companheiro1, companheiro2,companheiro3)

        val listView = findViewById<ListView>(R.id.listView)

        val adapter = ArrayAdapter(this, R.layout.list_item, R.id.textViewItem, items)
            listView.adapter = adapter


        val buttonVoltar = findViewById<Button>(R.id.botaoVoltar)

        buttonVoltar.setOnClickListener {
            voltar()
        }
    }




    fun voltar() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}