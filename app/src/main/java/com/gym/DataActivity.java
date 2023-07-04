package com.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewEdad = findViewById(R.id.textViewEdad);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        Intent intent = getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            String edad = intent.getStringExtra("edad");
            String email = intent.getStringExtra("email");

            textViewName.setText("Nombre: " + name);
            textViewEdad.setText("Edad: " + edad);
            textViewEmail.setText("Email: " + email);
        }
    }
}
