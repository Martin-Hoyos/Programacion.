/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.trabajo_n3;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Trabajo_N3 {

    static Scanner leer = new Scanner(System.in);
    static int num;
    static String nvar;

    public static void main(String[] args) {

        System.out.println("Ingresa el número de la matricula");
        num = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingresa la letra de la matricula");
        nvar = leer.nextLine();
        if (num < 9999) {
            num++;
        } else if (num == 9999) {
            num = 0;
            nvar = siguienteLetra(nvar);
        }
        System.out.printf("%04d%s\n", num, nvar);

    }

    private static String siguienteLetra(String letras) {
        char[] letrasArray = letras.toCharArray();
        if (letrasArray[2] < 'N') {
            letrasArray[2]++;
        } else {
            if (letrasArray[1] < 'N') {
                letrasArray[1]++;
                letrasArray[2] = 'B';
            } else {
                letrasArray[0]++;
                letrasArray[1] = 'B';
                letrasArray[2] = 'B';
            }
        }
        return String.valueOf(letrasArray);
    }
}
