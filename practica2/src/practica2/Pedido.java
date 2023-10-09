/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.io.Serializable;

/**
 *
 * @author sanci
 */
public class Pedido implements Serializable{
    private String Vehiculo;
    private String Distancia;
    private String monto;
    private String fecha_creacion;
    private String fecha_entrega;
    private boolean llegado;

    public Pedido(String Vehiculo, String Distancia, String monto, String fecha_creacion, String fecha_entrega, boolean llegado) {
        this.Vehiculo = Vehiculo;
        this.Distancia = Distancia;
        this.monto = monto;
        this.fecha_creacion = fecha_creacion;
        this.fecha_entrega = fecha_entrega;
        this.llegado = llegado;
    }

    public Pedido(String Vehiculo, String Distancia, boolean llegado) {
        this.Vehiculo = Vehiculo;
        this.Distancia = Distancia;
        this.llegado = llegado;
    }

    public Pedido(String Vehiculo, String Distancia, String fecha_creacion, boolean llegado,String monto) {
        this.monto = monto;
        this.Vehiculo = Vehiculo;
        this.Distancia = Distancia;
        this.fecha_creacion = fecha_creacion;
        this.llegado = llegado;
    }
    
    
    public boolean isLlegado() {
        return llegado;
    }

    public void setLlegado(boolean llegado) {
        this.llegado = llegado;
    }

   

    public Pedido() {
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String Distancia) {
        this.Distancia = Distancia;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    
}
