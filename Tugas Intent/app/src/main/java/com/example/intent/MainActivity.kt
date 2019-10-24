package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            if (et1.text.isEmpty() || et2.text.isEmpty() || et3.text.isEmpty()) {
                toast("Kolom tidak boleh kosong!!", Toast.LENGTH_LONG)
            } else if (et1.text.isNotEmpty() || et2.text.isNotEmpty() || et3.text.isNotEmpty()) {
                toast("Data Tersimpan", Toast.LENGTH_LONG)

                val nim = et1.text.toString()
                val nama = et2.text.toString()
                val nilai = et3.text.toString()

                val intent = Intent(this@MainActivity, Main2Activity::class.java)
                intent.putExtra("NIM", nim)
                intent.putExtra("Nama", nama)
                intent.putExtra("Nilai", nilai)
                startActivity(intent)

            }

        }

    }

    private fun toast(message: String, length : Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, message, length).show()


    }
}
