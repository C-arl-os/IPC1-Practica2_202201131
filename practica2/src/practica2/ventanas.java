/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.util.ArrayList;

/**
 *
 * @author sanci
 */
public class ventanas {
    public void Inicio(){
       login login = new login();
        
        login.setTitle("Bienvenido");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    public void Avance(ArrayList<Pedido> ped){
       Trayectoria login = new Trayectoria( ped);
        
        login.setTitle("Trayectos");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    }
    
    public void preparacion(ArrayList<Pedido> pedidoaux){
        Preparación_de_pedido login = new Preparación_de_pedido(pedidoaux);
        
        login.setTitle("Trayectos");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    
    
    
    
    }
    
    public void Historial(ArrayList<Pedido> pedidoaux){
        Historial login = new Historial(pedidoaux);
        
        login.setTitle("Trayectos");
        login.setResizable(false);
        login.setLocationRelativeTo(login);
        login.setVisible(true);
    
    
    }
    
    
}
