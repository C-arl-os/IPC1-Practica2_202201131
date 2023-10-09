/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import java.io.Serializable;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sanci
 */
public class Trayecto2 extends Thread implements Serializable{

    //creamos las variables
    private JLabel etiqueta;
    private Trayectoria moto;
    private int detener;
    private boolean llego;
    private boolean fecha;
    
    public boolean isLlego() {
        return llego;
    }

    public boolean isFecha() {
        return fecha;
    }

    public void setFecha(boolean fecha) {
        this.fecha = fecha;
    }

    public void setLlego(boolean llego) {
        this.llego = llego;
    }

    public Trayecto2(JLabel etiqueta, Trayectoria moto, int detener) {
        this.etiqueta = etiqueta;
        this.moto = moto;
        this.detener = detener;
    }

    //contrue
    public Trayecto2(JLabel etiqueta, Trayectoria moto) {
        this.etiqueta = etiqueta;
        this.moto = moto;
    }

    @Override
    public void run() {
        boolean aa = true, deten = true;
        int moto1 = 0;
        int moto2 = 0;
        int moto3 = 0;
        while (deten == true) {
            try {

                sleep(detener);
                moto1 = moto.getPrimerMoto().getLocation().x;
                moto2 = moto.getSegundaMoto().getLocation().x;
                moto3 = moto.getTercerMoto().getLocation().x;
                if (aa) {
                    if (etiqueta.getLocation().x >= moto.getBarrera().getLocation().x - 125) {

                        JOptionPane.showMessageDialog(null, "Pedido ha llegado de moto 2");
                        fecha = true;
                    }
                    if (moto2 <= moto.getBarrera().getLocation().x - 125) {
                        etiqueta.setLocation(etiqueta.getLocation().x + 10, etiqueta.getLocation().y);
                        moto.repaint();
                    } else {
                        aa = false;
                    }
                } else if (moto2 >= 1) {
                    etiqueta.setLocation(etiqueta.getLocation().x - 10, etiqueta.getLocation().y);
                    moto.repaint();
                } else {
                    deten = false;
                    llego =true;
                    break;

                }
            } catch (Exception e) {
                System.out.println(e);
            }

            /* if (etiqueta.getLocation().x >= moto.getBarrera().getLocation().x - 125) {
                if (moto3 > moto2 || moto1 == moto2) {
                    JOptionPane.showMessageDialog(null, "Pedido ha llegado");
                }
            }*/

        }
    }
}
