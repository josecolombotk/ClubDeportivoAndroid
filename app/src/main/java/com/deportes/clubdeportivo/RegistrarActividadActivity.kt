package com.deportes.clubdeportivo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistroActividadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_actividad)


        // Lógica de la barra superior
        val btnAtras: ImageView = findViewById(R.id.buttonBack)
        val textViewTitulo: TextView = findViewById(R.id.textViewTitle)

        textViewTitulo.text = "Registro de Actividad"

        btnAtras.setOnClickListener {
            finish()
        }

        val btnRegistrarActividad = findViewById<Button>(R.id.btnRegistrarActividad)
        val btnModificarActividad = findViewById<Button>(R.id.btnModificarActividad)
        val btnEliminarActividad = findViewById<Button>(R.id.btnEliminarActividad)

        // Lógica al registrar actividad
        btnRegistrarActividad.setOnClickListener {
            val registroExitosoDialog = RegistroExitosoFragment.newInstance()
            registroExitosoDialog.setOnVolverClickListener {
                // ... lógica al volver ...
            }
            registroExitosoDialog.show(
                supportFragmentManager, RegistroExitosoFragment.TAG
            ) // Usar el nuevo TAG
        }

        // Lógica al modificar actividad
        btnModificarActividad.setOnClickListener {
            startActivity(Intent(this, ModificarActividadActivity::class.java))
        }

        // Lógica al eliminar actividad
        btnEliminarActividad.setOnClickListener {
            val eliminarActividadDialog = EliminarActividadFragment.newInstance()
            eliminarActividadDialog.setOnVolverClickListener {
                // ... lógica al volver ...
            }
            eliminarActividadDialog.show(
                supportFragmentManager, EliminarActividadFragment.TAG
            ) // Usar el nuevo TAG
        }

    }
}
