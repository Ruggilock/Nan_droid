package com.example.fredy.finalfinalfinalx3sis2.Vistas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fredy.finalfinalfinalx3sis2.Modelo.Cliente;
import com.example.fredy.finalfinalfinalx3sis2.R;

import org.w3c.dom.Text;


/**
 * Created by fredy on 11/4/16.
 */

public class Perfil extends AppCompatActivity {
    Cliente cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.perfil);
        Bundle datos = this.getIntent().getExtras();
        this.cl = null;
        this.cl = (Cliente) datos.getSerializable("var_usuario");
        Context context = this;
        this.Inicializar_menu(context);
        this.SetDatos();
        Button boton_pass = (Button) findViewById(R.id.perfil_button_cambiar_pass);

        boton_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambiar_contraseña();
            }
        });

    }

    private void SetDatos(){
        TextView nombre_usuario = (TextView) findViewById(R.id.perfil_nombre_usuario);
        nombre_usuario.setText(cl.getNombre_de_usuario());
        TextView razon_social = (TextView) findViewById(R.id.perfil_razon_Social);
        razon_social.setText(cl.getRazon_social());
        TextView linea_credito = (TextView) findViewById(R.id.perfil_Linea_de_credito);
        linea_credito.setText(cl.getLinea_credito().toString());
        TextView  estado_deuda = (TextView) findViewById(R.id.perfil_Estado_de_deuda);
        if (cl.getEstado_deuda()){
            estado_deuda.setText("Debe");
        } else{
            estado_deuda.setText("No Debe");
        }
        TextView ruc = (TextView) findViewById(R.id.perfil_numero_ruc);
        ruc.setText(cl.getRuc());
    }
    private void Cambiar_contraseña(){
        EditText actual_contraseña = (EditText) findViewById(R.id.perfil_contra_actual);
        EditText nueva_contraseña = (EditText) findViewById(R.id.perfil_contra_nueva);

        if (actual_contraseña.getText().toString().compareTo(cl.getContraseña())==0){
            cl.setContraseña(nueva_contraseña.getText().toString());
            Context context = getApplicationContext();
            CharSequence text = "contraseña cambiada";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


        }else {
            Context context = getApplicationContext();
            CharSequence text = "contraseña incorrecta";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        actual_contraseña.setText("");
        nueva_contraseña.setText("");


    }
    private void Inicializar_menu(final Context context) {

        ImageButton boton_perfil = (ImageButton) findViewById(R.id.perfil_button);
        boton_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent perfil = new Intent(context, Perfil.class);
                startActivity(perfil);

            }
        });

        ImageButton boton_catalogo = (ImageButton) findViewById(R.id.catalogo_button);

        boton_catalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent catalogo = new Intent(context, Catalogo.class);
                startActivity(catalogo);

            }
        });


        ImageButton boton_hacer_pedido = (ImageButton) findViewById(R.id.hacer_pedido_button);
        boton_hacer_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hacer_pedido = new Intent(context, HacerPedido.class);
                startActivity(hacer_pedido);

            }
        });


        ImageButton boton_administrar_pedido = (ImageButton) findViewById(R.id.administrar_pedido_button);
        boton_administrar_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent administrarPedido = new Intent(context, AdministrarPedido.class);
                startActivity(administrarPedido);

            }
        });


        ImageButton boton_historial = (ImageButton) findViewById(R.id.historial_button);
        boton_historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent historialPedido = new Intent(context, HistorialPedido.class);
                startActivity(historialPedido);

            }
        });

    }

}
