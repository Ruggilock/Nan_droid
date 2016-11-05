package com.example.fredy.finalfinalfinalx3sis2.Controller;

import com.example.fredy.finalfinalfinalx3sis2.Modelo.Producto;
import com.orm.SugarRecord;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by fredy on 11/4/16.
 */

public class GestorProducto  extends SugarRecord implements Serializable{
    ArrayList<Producto> productos;

    public GestorProducto (){
        this.productos = new ArrayList<Producto>();
    }
}
