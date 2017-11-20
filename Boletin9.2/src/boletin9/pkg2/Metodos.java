/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg2;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
        Scanner sc=new Scanner(System.in);
    public void calcular(){
        int suma=0,cproducto=10,csuma=10,i=0;
        double producto=1;
        do{
            producto=producto*cproducto++;
            suma=suma+csuma++;
            i++;
        }while(i<80);
        System.out.println("Suma de todos los numeros = "+suma+". Producto de todos los numeros = "+producto+". ");
}
}
