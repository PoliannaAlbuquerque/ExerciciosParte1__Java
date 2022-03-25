/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner numero1 = new Scanner(System.in);
       System.out.print("Escreva um número inteiro: ");
       int num1 = numero1.nextInt(); 
       
       
       int i = 1;
       int resultado = 0;
       while (i <= num1){
           resultado += i;
           i++; 
       }
    System.out.println(resultado);
    }
}
