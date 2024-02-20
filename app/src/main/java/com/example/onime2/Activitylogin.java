package com.example.onime2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Activitylogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Obtén una referencia al TextView
        TextView textRegistro = findViewById(R.id.textregistro);

        // Agrega un OnClickListener al TextView
        textRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la ActivityRegistrar
                Intent intent = new Intent(Activitylogin.this, ActivityRegistrar.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });

        // Obtén una referencia al botón
        Button buttonLogin = findViewById(R.id.buttonLogin);

        // Agrega un OnClickListener al botón
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la actividad Hola
                Intent intent = new Intent(Activitylogin.this, hola.class);

                // Inicia la nueva actividad
                startActivity(intent);
            }
        });

        // Resto del código...
    }
}
