package boletin19_4;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Metodos {
    public void calcularLetraDNI(int[] numero,char[] letra){
        int dni=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca DNI a comprobar la letra."));
        int resto=dni%23;
        for(int i=0;i<numero.length;i++){
            if(resto==numero[i]){
                JOptionPane.showMessageDialog(null, "La letra de su DNI es: "+letra[i]);
            }
        }
    }
}
