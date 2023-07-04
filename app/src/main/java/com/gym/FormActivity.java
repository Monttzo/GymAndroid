package com.gym;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEdad;
    private EditText editTextEmail;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editTextName = findViewById(R.id.editTextName);
        editTextEdad = findViewById(R.id.editTextEdad);
        editTextEmail = findViewById(R.id.editTextEmail);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String edad = editTextEdad.getText().toString();
                String email = editTextEmail.getText().toString();

                openDataActivity(name, edad, email);
            }
        });
    }

    public void openDataActivity(String name, String edad, String email) {
        Intent intent = new Intent(this, DataActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("edad", edad);
        intent.putExtra("email", email);
        startActivity(intent);
    }
}
