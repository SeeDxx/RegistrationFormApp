package com.example.registrationformapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextEmail;
    private Button buttonSubmit;
    private EditText editTextTextPassword;
    private EditText editTextTextPassword2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextTextEmail);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextTextPassword.getText().toString().trim();
                String password2 = editTextTextPassword2.getText().toString().trim();

                if (name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Prosze wprowadzic imie", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()){
                    Toast.makeText(MainActivity.this, "Prosze wprowadzic email", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Prosze wprowadzic haslo", Toast.LENGTH_SHORT).show();
                } else if (password2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Prosze podtwierdzic haslo", Toast.LENGTH_SHORT).show();
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    Toast.makeText(MainActivity.this, "Nie poprawny adres email", Toast.LENGTH_SHORT).show();
                } else if (!password2.equals(password)){
                    Toast.makeText(MainActivity.this, "Nie poprawne haslo", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Formularz wyslany poprawnie", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}