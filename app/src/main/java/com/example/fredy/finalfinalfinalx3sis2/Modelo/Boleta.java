package com.example.fredy.finalfinalfinalx3sis2.Modelo;

/**
 * Created by fredy on 11/3/16.
 */

public class Boleta extends Comprobante {
    private String NumeroBoleta;

    public Boleta(String numeroBoleta, String fechaEmision, Double total, Integer numCuotas) {
        super(fechaEmision, total,numCuotas);
        this.NumeroBoleta = numeroBoleta;
    }

    public String getNumeroBoleta() {
        return NumeroBoleta;
    }

    public void setNumeroBoleta(String numeroBoleta) {
        NumeroBoleta = numeroBoleta;
    }
}
