/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ej_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Martin
 */
public class EJ_4 {

    static String csvFile = "C:/Users/Martin/Documents/NetBeansProjects/EJ_4/lista_alumnos.csv";
    static int contadorLineas = -1;
    static int[] edades = {25, 22, 28, 24, 26, 23, 27, 25, 29, 26, 24, 21, 30, 22, 29, 27, 23, 28, 26, 24};
    static double[] notas = {8.5, 7.9, 6.2, 8.9, 7.3, 9.1, 6.8, 8.0, 7.5, 9.3, 6.5, 8.7, 7.0, 8.2, 6.9, 8.4, 7.8, 9.0, 7.6, 8.6};

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(",");

                for (String part : parts) {
                    System.out.print(part + " ");
                }
                System.out.println();
                contar(parts);

            }
            imprimirNumeroEstudiantes();
            System.out.println(" ");
            System.out.println("La edd media de la clase es: " + edadmedia(edades));
            System.out.println(" ");
            System.out.println("La nota media de la clase es: " + notamedia(notas));
            System.out.println(" ");
            System.out.println("La nota minima de la clase es: " + notaminima(notas));
            System.out.println(" ");
            System.out.println("La nota máxima de la clase es: " + notamaxima(notas));

            System.out.println();
            System.out.println();
            System.out.println();

//            double num = 7.51493;
//            System.out.print("Imprimiendo un decimal con variable double...");
//            System.out.println(String.format("%.2f", num));
//
//            String cadena = "123.123456";
//            double num_string = Double.parseDouble(cadena);
//            System.out.print("Imprimiendo un decimal con variable string...");
//            System.out.println(String.format("%.2f", num_string));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile, true))) {
            writer.newLine(); // Nueva línea como separador
            writer.write("Número de estudiantes: " + contadorLineas);
            writer.newLine();
            writer.write("Edad media de la clase: " + String.format("%.2f", edadmedia(edades)));
            writer.newLine();
            writer.write("Nota media de la clase: " + notamedia(notas));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String informeFile = "C:/Users/Martin/Documents/NetBeansProjects/EJ_4/informe-clase.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(informeFile))) {
            writer.write("Número de estudiantes: " + contadorLineas);
            writer.newLine();
            writer.write("Edad media de la clase: " + String.format("%.2f", edadmedia(edades)));
            writer.newLine();
            writer.write("Nota media de la clase: " + notamedia(notas));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void contar(String[] parts) {
        System.out.println("Esta formado por " + parts.length + " elementos");
        contadorLineas++;
    }

    static void imprimirNumeroEstudiantes() {
        System.out.println("Esta clase tiene " + contadorLineas + " estudiantes");
    }

    static double edadmedia(int[] edades) {
        double media = 0;
        double sumatotal = 0;

        for (double nota : edades) {
            sumatotal += nota;
        }
        media = sumatotal / 20;

        return media;
    }

    static String notamedia(double[] arrayNotas) {
        double media = 0;
        double sumatotal = 0;

        for (double nota : arrayNotas) {
            sumatotal += nota;
        }
        media = sumatotal / 20;
        String texto;

        texto = String.format("%.2f", media);
        String imprimir;

        return texto;
    }

    static double notaminima(double[] notas) {
        double min = 10;

        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }

        return min;
    }

    static double notamaxima(double[] notas) {
        double max = 0;

        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }

        return max;
    }
}
