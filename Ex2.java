/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Pedro
 */
public class Ex2 {
    public static void main(String[] args) {
      double perc = (1.5/100);
        double salario = 1000;
        int i;
        
        salario = salario + (salario * perc);
        
        for (i = 1997; i < 2022; i++) {
            
            perc = perc * 2;
            salario = salario + (salario*perc);
        
        }
        System.out.println("O salário do funcionario em 2022 está de: " + salario);
    }
}
