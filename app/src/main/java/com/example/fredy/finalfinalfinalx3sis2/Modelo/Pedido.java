package com.example.fredy.finalfinalfinalx3sis2.Modelo;

import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by fredy on 11/3/16.
 */

public class Pedido  extends SugarRecord implements Serializable{
    private String Identificador;
    private Double Monto;
    private String Estado;
    private Integer NumCuotas;
    private String Tracking;
    private String Fecha;
    ArrayList<DetallePedido> ListDetallePedido;
    private Comprobante Comprobante;

    public Pedido(){

    }
    public Pedido(String identificador, Double monto, String estado, Integer numCuotas, String tracking,String fecha) {
        this.Identificador = identificador;
        this.Monto = monto;
        this.Estado = estado;
        this.NumCuotas = numCuotas;
        this.Tracking = tracking;
        this.Fecha  = fecha;
        ListDetallePedido = new ArrayList<DetallePedido>();
        this.Comprobante = null;
    }

    public void AgregarDetallePedido(DetallePedido detallePedido){
        this.ListDetallePedido.add(detallePedido);
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String identificador) {
        Identificador = identificador;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double monto) {
        Monto = monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Integer getNumCuotas() {
        return NumCuotas;
    }

    public void setNumCuotas(Integer numCuotas) {
        NumCuotas = numCuotas;
    }

    public String getTracking() {
        return Tracking;
    }

    public void setTracking(String tracking) {
        Tracking = tracking;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public Comprobante getComprobante() {
        return Comprobante;
    }

    public void agregarComprobante(String fechaEmision, Integer tipo) {
        if (tipo == 0){
            //Boleta
            this.Comprobante = new Boleta("00000", fechaEmision, this.Monto,this.NumCuotas);
        } else{
            //Factura
            Double subTotal = this.Monto / (1 + Factura.IGV_const);
            Double igv = Factura.IGV_const*subTotal;
            this.Comprobante = new Factura("00000", null, subTotal,  igv, fechaEmision, this.Monto,this.NumCuotas);
        }
    }
}
