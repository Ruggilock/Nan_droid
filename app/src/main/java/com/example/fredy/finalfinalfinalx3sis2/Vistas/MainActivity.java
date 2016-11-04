package com.example.fredy.finalfinalfinalx3sis2.Vistas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fredy.finalfinalfinalx3sis2.Controller.GestorCliente;
import com.example.fredy.finalfinalfinalx3sis2.R;

public class MainActivity extends AppCompatActivity {
    private GestorCliente GestorCliente;
    private EditText loginUsuario;
    private EditText loginContrasenia;
    final Context context = this;
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
                    Intent perfil = new Intent(context, Perfil.class);
                    startActivity(perfil);
                }else{
                    Context context = getApplicationContext();
                    CharSequence text = "error de usuario o contraseña";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();


                }
            }
        });
    }

    private Boolean verificarUsuario() {
        Boolean resultado = this.GestorCliente.comprobarLogin(loginUsuario.getText().toString(),loginContrasenia.getText().toString());
        return resultado;
    }
}
