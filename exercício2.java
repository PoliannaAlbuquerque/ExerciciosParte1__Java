/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class exercício2 {
     @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       int num1 = 0;
       int i = 0;
       int soma = 0;
       do {
       soma += num1;
       i++;
       Scanner numdigitado = new Scanner(System.in);
       System.out.print("Escreva um número: ");
       num1 = numdigitado.nextInt();
       
       }
       while (num1 >= 0);
       System.out.println(soma/(i-1));

       }
    }



