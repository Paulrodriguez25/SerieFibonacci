/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author paul rodriguez
 */
public class SerieFibonacci {

   
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
     
        System.out.println("Ingresa el tamaño de la serie: ");
        int numero = Teclado.nextInt();
        
        for(int i = 0; i < numero; i++){
            System.out.println(Fibonacci(i) + "");
        }
        System.out.println("");
    }
    public static int Fibonacci(int n){
    //FUNCION RECURSIVA
        if(n>1){
        return Fibonacci(n - 1) + Fibonacci(n-2);
        }
        else if(n==1){
        return 1;
        }
        else if(n==0){
        return 0;
        }
        else{
        System.out.println("Debe ingresar un numero mayor o igual 1 " );
        return -1;
      }
    }
}
