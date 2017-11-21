/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg6;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {       
    Scanner reader = new Scanner(System.in);
    double soldo = 0;
    int A = 0;
    int M = 0;
    int i = 0;
    public void Metodo(){
        do{
        i++;
        System.out.print("Escribe el sueldo numero " + i + ": ");
        soldo = reader.nextDouble();
        if(soldo >= 1000 && soldo <= 1750){
            A +=1;
        } else if(soldo < 1000 && soldo >= 1){
            M +=1;
        } else if(soldo < 0){
            i--;
        }
        } while(soldo != 0);
        
        System.out.println("Ganan entre 1000 e 1750: " + A + " trabajadores.");
        System.out.println("Ganan menos de 1000: " + ((100 * M) / i) + "% dos trabajadores.");
}
        }

