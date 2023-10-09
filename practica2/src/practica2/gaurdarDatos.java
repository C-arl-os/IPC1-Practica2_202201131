/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sanci
 */
public class gaurdarDatos implements Serializable{
    
    ArrayList<Pedido> ped;

    public gaurdarDatos(ArrayList<Pedido> ped) {
        this.ped = ped;
    }

    public ArrayList<Pedido> getPed() {
        return ped;
    }

    public void setPed(ArrayList<Pedido> ped) {
        this.ped = ped;
    }

    public gaurdarDatos() {
    }
    
    
}
