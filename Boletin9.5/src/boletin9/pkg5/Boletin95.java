/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        boolean opcionNoElegida = false;
        do{
        String res = JOptionPane.showInputDialog(null, "MENU\nElija una opción:\nA)Serie A\nB)Serie B\nC)Serie C");
        switch(String.valueOf(res)){
            case "A":
                JOptionPane.showMessageDialog(null,"Ha elegido la serie A");
                obx.serieA();
                break;
            case "B":
                JOptionPane.showMessageDialog(null,"Ha elegido la serie B");
                obx.serieB();
                break;
            case "C":
                JOptionPane.showMessageDialog(null,"Ha elegido la serie C");
                obx.serieC();
                break;
            default:JOptionPane.showMessageDialog(null,"Opcion incorrecta");
                opcionNoElegida = true;
        }
        }while(opcionNoElegida);
    }
    
}
