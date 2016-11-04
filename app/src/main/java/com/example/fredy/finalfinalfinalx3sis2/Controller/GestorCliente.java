package com.example.fredy.finalfinalfinalx3sis2.Controller;

import com.example.fredy.finalfinalfinalx3sis2.Modelo.Cliente;

import java.util.ArrayList;

/**
 * Created by fredy on 11/3/16.
 */

public class GestorCliente {
    private ArrayList<Cliente> Clientes;

    public GestorCliente(){
        this.Clientes = new ArrayList<Cliente>();

        /*DiegoG*/
        this.nuevoCliente("godievski","asd",false,99999999.0,"Ka-Tet Corp.");

    }

    public Cliente obtenerClientePorID(String id){
        for(int i = 0; i < this.Clientes.size(); i++){
            if(this.Clientes.get(i).getNombre_de_usuario().compareTo(id)==0)
                return this.Clientes.get(i);
        }
        return null;
    }


    public Boolean comprobarLogin(String id, String pass){
        Cliente cl = this.obtenerClientePorID(id);
        if(cl != null){
            if(cl.getContraseña().compareTo(pass)==0)
                return true;
            else
                return false;
        } else
            return false;
    }
    public void nuevoCliente(String nombre_de_usuario, String contraseña, Boolean estado_deuda, Double linea_credito, String razon_social){
        this.Clientes.add(new Cliente(nombre_de_usuario,contraseña,estado_deuda,linea_credito,razon_social));
    }
}
