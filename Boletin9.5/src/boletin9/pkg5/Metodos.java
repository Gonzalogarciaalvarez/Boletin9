/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg5;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
    Scanner sc=new Scanner(System.in);
    int cant,num,i;
    
    public void pedirElementos(){
        System.out.println("De cuanto elementos quiere la serie?");
        cant= sc.nextInt();
    }
    
    public void serieA(){
        num=2;
        
        Metodos.this.pedirElementos();
        cant=cant-1;
        for(i=0;i<cant;i++){
            System.out.print(num+" + ");
            num=num+2;
        }
        System.out.print(num+" ");
    }
    
    public void serieB(){
        num=1;
        int cont=0;
        
        Metodos.this.pedirElementos();
        for(i=0;i<cant;i++){
            if(cont==1){
                System.out.print(" + "+num+" ");
                num++;
                cont--;
            }
            else if(cont==0){
                System.out.print(" - "+num+" ");
                num++;
                cont++;
            }
        }
    }
    
    public void serieC(){
        int num1=1,num2=1;
        
        Metodos.this.pedirElementos();
        cant=cant-2;
        System.out.print("0, ");
        for(i=0;i<cant;i++){
            System.out.print(num1+", ");
            num2=num1+num2;
            num1=num2-num1;
        }
        System.out.println(num1+ " ");
}
}
