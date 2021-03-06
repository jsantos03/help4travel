/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.edu.cure.servidor.central.dto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SCN
 */
public class Promocion {

    private String nombre;
    private int descuento;
    private double precioTotal;
    private List<Servicio> servicios;
    private Proveedor proveedor;
    

    public Promocion(String nombre, int descuento, double preciototal, Proveedor proveedor) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precioTotal = preciototal;
        this.proveedor = proveedor;
        servicios = new ArrayList<Servicio>();
    }
    
    public Promocion(String nombre, int descuento, double preciototal, List<Servicio> servicios, Proveedor proveedor) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precioTotal = preciototal;
        this.proveedor = proveedor;
        this.servicios = servicios;
    }
    
    public Promocion (){
        this.nombre = "";
        this.descuento = 0;
        this.precioTotal = 0;
        this.proveedor = null;
        servicios = new ArrayList<Servicio>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(Servicio servicio) {
        servicios.add(servicio);
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
    
    
}
