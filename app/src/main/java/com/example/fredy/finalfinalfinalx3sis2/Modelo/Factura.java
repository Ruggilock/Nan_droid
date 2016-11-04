package com.example.fredy.finalfinalfinalx3sis2.Modelo;

/**
 * Created by fredy on 11/3/16.
 */

public class Factura extends Comprobante{
    public static final Double IGV_const = 0.18;

    private String NumeroFactura;
    private String FechaCancelacion;
    private Double SubTotal;
    private Double Igv;
/*Constructor*/

    public Factura(String numeroFactura, String fechaCancelacion, Double subTotal, Double igv, String fechaEmision, Double total,
                   Integer numCuotas)
    {
        super(fechaEmision, total, numCuotas);
        this.FechaCancelacion=fechaCancelacion;
        this.NumeroFactura=numeroFactura;
        this.SubTotal=subTotal;
        this.Igv=igv;

    }


    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        NumeroFactura = numeroFactura;
    }

    public String getFechaCancelacion() {
        return FechaCancelacion;
    }

    public void setFechaCancelacion(String fechaCancelacion) {
        FechaCancelacion = fechaCancelacion;
    }

    public Double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(Double subTotal) {
        SubTotal = subTotal;
    }

    public Double getIgv() {
        return Igv;
    }

    public void setIgv(Double igv) {
        Igv = igv;
    }
}
