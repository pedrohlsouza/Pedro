/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ex1 {

    public static void main(String[] args) {
        int numero, maior = 0, menor = 0, meno, i = 1;
        Scanner sc = new Scanner(System.in);
        
        while(i<=5){
            System.out.println("Informe o valor do número " + i + "º");
            numero = sc.nextInt();
            if(numero > maior){
                maior = numero;
            }
            
            menor = numero;
            
            if(numero < menor){
                menor =numero;
            }
            i++;
        }
        System.out.println("O maior número é: " + maior + ", e o menor é: " + menor);
    }
}
