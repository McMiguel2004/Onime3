package com.example.onime2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.onime2.Activitylogin;

public class ActivityRegistrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        // Obtén la referencia del TextView
        TextView textotoinicio = findViewById(R.id.textotoinicio);

        // Agrega un OnClickListener al TextView
        textotoinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Cuando se hace clic, inicia la nueva actividad (Activitylogin)
                Intent intent = new Intent(ActivityRegistrar.this, Activitylogin.class);
                startActivity(intent);
            }
        });

        // Puedes realizar cualquier configuración adicional necesaria para tu actividad aquí
    }
}
