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
public class Productos implements Serializable{
    private String Producto;
    private String Precio;

    public Productos(String Producto, String Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public Productos() {
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
    
    
}
