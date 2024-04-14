package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CrearCuenta extends AppCompatActivity {

    EditText correoElectronico, contrasenya, confirmarContrasenya;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_cuenta);
        inicializarVariables();
    }

    private void inicializarVariables() {
        correoElectronico = findViewById(R.id.txtCorreoElectronicoCrear);
        contrasenya = findViewById(R.id.txtContrasenyaCrear);
        confirmarContrasenya = findViewById(R.id.txtConfirmarContrasenyaCrear);
        registro = findViewById(R.id.btnCrearCuenta);
    }
}