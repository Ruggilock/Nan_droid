package com.example.fredy.finalfinalfinalx3sis2.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fredy.finalfinalfinalx3sis2.Controller.GestorCliente;
import com.example.fredy.finalfinalfinalx3sis2.R;

public class MainActivity extends AppCompatActivity {
    private GestorCliente GestorCliente;
    private EditText loginUsuario;
    private EditText loginContrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1 = (Button) findViewById(R.id.buttonIngresar);
        loginUsuario = (EditText) findViewById(R.id.loginUsuario);
        loginContrasenia = (EditText) findViewById(R.id.loginContrasenia);
        GestorCliente = new GestorCliente();
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (verificarUsuario()){

                }
            }
        });
    }

    private Boolean verificarUsuario() {
        Boolean resultado = this.GestorCliente.comprobarLogin(loginUsuario.getText().toString(),loginContrasenia.getText().toString());
        return resultado;
    }
}
