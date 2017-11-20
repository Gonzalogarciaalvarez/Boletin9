/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg4;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
        Scanner sc=new Scanner(System.in);
    public void tablaMultiplicar(){
        int num=0,mult=1,contador=1,i=0;
        
        do{
            if(num<0){
                System.out.println("\nError! Introduzca un numero positivo\n\n\n");
            }
            System.out.println("Que tabla quiere ver?");
            num=sc.nextInt();
        }while(num<0);
        
        if(num!=0){
                System.out.println("\n*** Tabla del "+num+" ***");
            }
        
        while(i<10&&num>0){
                
                if(num>0){
                int resultado=num*mult++;
                System.out.println(num+" por "+(contador++)+" = "+resultado);
                i++;
            }
        }
}
}
