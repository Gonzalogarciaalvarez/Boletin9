/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg3;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
        Scanner sc=new Scanner(System.in);
    public double areaRectangulo(){
        double base=0,altura=0,area;
        do{
            if(base<0||altura<0){
                System.out.println("\nError! Introduzca valores positivos\n\n\n");
            }
            System.out.println("Introduzca la base del rectangulo");
            base=sc.nextDouble();
            System.out.println("Introduzca la altura del rectangulo");
            altura=sc.nextDouble();
        }while(base<0||altura<0);
        return area=base*altura;
}
}
