package com.example.tfg_def;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InvitarAmigo extends AppCompatActivity {
    Button enviar;
    String correo;
    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitar_amigo);
        inicializarVariables();
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = String.valueOf(texto.getText());
                Toast.makeText(InvitarAmigo.this, "Se ha enviado una invitación a"+correo, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void inicializarVariables() {
        enviar = findViewById(R.id.btnEnviar);
        texto = findViewById(R.id.txtCorreo);

    }
}