/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mi, tempo = 0, ma, hora = 0, min = 0;

        System.out.println("Informe a massa inicial em gramas: ");
        ma = sc.nextDouble();
        mi = ma;
        while (ma >= 0.5) {

            ma = (ma / 2);
            tempo = tempo + 50;
            min = tempo / 60;
            hora = (tempo / 60) / 60;

        }
        System.out.println("Massa inicial :" + mi);
        System.out.println("Massa final: " + ma);
        System.out.println("Tempo em segundos: " + tempo);
        System.out.println("Tempo em horas: " + hora);
        System.out.println("Tempo em minutos: " + min);
    }
}
