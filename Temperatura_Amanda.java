/*
 * Programa que apresente a conversão de temperatura de celsius para Fahrenheit
 com intervalos de 10 em 10 até o 100.
*/
package temperatura_amanda;

import java.util.Scanner;

/**
 *
 * @Amanda Vilela
 */
public class Temperatura_Amanda {

    
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        
         float C,F,i;
         
         System.out.println("Digite a temperatura em Celsius:");
         
         C = leitor.nextFloat();
    
         for(i=0; i <=100;i+=10)
         {
             F = (float)(((C+i)*1.8)+32);
         
        
        System.out.println(" A temperatura em Fahrenheint é:" +F);
      
        }
    }
}  

       