/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author romarei
 */
public class main {
     public static void main(String[] args){
            System.out.println("primer cambio");
            System.out.println("seleccione la operación a realizar 1:suma 2:resta 3: multiplicar 4:dividir");
            Scanner teclado;
            teclado = new Scanner(System.in);
            int operacion=teclado.nextInt();
            int a,b;
            System.out.println("introduce el valor del primer operador");
            a=teclado.nextInt();
            System.out.println("Introduce el valor del segundo operador");
            b=teclado.nextInt();
            calculadora calcu=new calculadora(a,b);
              switch (operacion){
                case 1 -> System.out.println("El resultado es "+calcu.suma());
                case 2 -> System.out.println("El resultado es "+calcu.resta());
                case 3 -> System.out.println("El resultado de la mujltiplicación es "+calcu.multiplicar());
//                case 4 -> System.out.println(" El resultado es "+calcu.divide());
                default -> System.out.println("no ha elegido la operación correcta");  
            }
        }
}
    


