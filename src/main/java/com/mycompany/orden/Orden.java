/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.orden;

/**
 *
 * @author Martin
 */
import java.util.Scanner;

public class Orden {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int[] sucesion;
        String respuesta;

        System.out.println("Ingresa el número de elementos en la sucesión:");
        num = leer.nextInt();
        leer.nextLine();

        if (num <= 1) {
            System.out.println("Debe tener más de un valor para ser válido.");
            return;
        }

        sucesion = new int[num];

        System.out.println("Ingresa el primer valor:");
        sucesion[0] = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i < num; i++) {
            System.out.println("Ingresa el valor:");
            sucesion[i] = leer.nextInt();
            leer.nextLine();
        }

        System.out.println(comprobarOrden(sucesion));

        System.out.println("Valores completados.");

    }

    public static String comprobarOrden(int[] sucesion) {
        boolean ascendente = true;
        boolean descendente = true;

        for (int i = 1; i < sucesion.length; i++) {
            if (sucesion[i] < sucesion[i - 1]) {
                ascendente = false;
                break;
            }
        }

        for (int i = 1; i < sucesion.length; i++) {
            if (sucesion[i] > sucesion[i - 1]) {
                descendente = false;
                break;
            }
        }

        if (ascendente) {
            return "DALTON";
        } else if (descendente) {
            return "DALTON";
        } else {
            return "DESCONOCIDO";
        }
    }
}
