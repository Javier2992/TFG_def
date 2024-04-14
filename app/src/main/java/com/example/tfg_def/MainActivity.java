package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tfg_def.R;

public class MainActivity extends AppCompatActivity {
    EditText correoElectronico, contrasenya;
    Button inicio, registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVariables();

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        CrearCuenta.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarVariables() {
        correoElectronico = findViewById(R.id.txtCorreoElectronico);
        contrasenya = findViewById(R.id.txtContrasenya);
        inicio = findViewById(R.id.btnIniciarSesion);
        registro = findViewById(R.id.btnRegistrate);
    }
}