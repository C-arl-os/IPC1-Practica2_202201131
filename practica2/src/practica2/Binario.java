/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author sanci
 */
public class Binario {
     String descuentos;
    public Binario() {
        this.descuentos = "C:\\Users\\sanci\\Desktop\\pr\\IPC1_2S2023_Proyecto1_202201131\\Practica1_buena\\Archivos\\Descuentos.bin";
    }
    
    public boolean guardar(gaurdarDatos lista){
        try {
            FileOutputStream fos = new FileOutputStream(descuentos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.close();
            fos.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public gaurdarDatos obtener(){
        gaurdarDatos lista = new gaurdarDatos();
        try {
            File f = new File(descuentos);
            if(f.exists()){
                FileInputStream fis = new FileInputStream(descuentos);
                ObjectInputStream ois = new ObjectInputStream(fis);
                lista = (gaurdarDatos) ois.readObject();
                ois.close();
                fis.close();
            }else{
            
            }
            return lista;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "aa");
            
        } 
         return null;
    }
    
    
    
    
       
        

        
    






   
}
