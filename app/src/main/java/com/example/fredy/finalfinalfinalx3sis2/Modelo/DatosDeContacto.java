package com.example.fredy.finalfinalfinalx3sis2.Modelo;

/**
 * Created by fredy on 11/3/16.
 */

public class DatosDeContacto {
    private String Email;
    private String Numero;

    public DatosDeContacto(String email,String numero){
        this.Email=email;
        this.Numero=numero;

    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }
}
