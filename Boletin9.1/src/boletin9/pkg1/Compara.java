/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg1;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Compara {
     Scanner sc=new Scanner(System.in);
    public void calculoNum(){
        int i=0,positivo=0,negativo=0,cero=0; //Contadores
        int num; //Variable para guardar los 10 numeros
        System.out.println("Introduzca 10 numeros separados por un intro");
        do{
            num=sc.nextInt();
            if(num>0){
                positivo++;
                i++;
            }
            else if(num<0){
                negativo++;
                i++;
            }
            else if(num==0){
                cero++;
                i++;
            }
            else{
                System.out.println("Error!");
            }
        }while(i<10);
        System.out.println(positivo+" numeros positivos, "+negativo+" numeros negativos y "+cero+" ceros.");
}
}
