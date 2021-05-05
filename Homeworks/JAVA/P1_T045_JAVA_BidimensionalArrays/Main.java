package USTA.fis;
/* Author: Jorge Daniel Ramírez Nieves
Date: May/04/2021
Description: This program will calculate with arrays the fibonacci number*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final int ROWS = 5, COLUMNS = 5;
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][] A = new int[ROWS][COLUMNS]; //Se crea una matriz de 5 filas y 4 columnas

        //Se introducen por teclado los valores de la matriz
        System.out.println("Lectura de elementos de la matriz: ");
        for (i = 0; i < ROWS; i++) {
            for (j = 0; j < COLUMNS; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                A[i][j] = sc.nextInt();
            }
        }

        //Mostrar por pantalla los valores que contiene la matriz
        System.out.println("valores introducidos:");
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz
        major = minor = A[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        major_rows = minor_rows = major_col = minor_col = 0;

        //mediante dos bucles for anidados recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (i = 0; i < A.length; i++) {  //para cada fila de la matriz
            for (j = 0; j < A[i].length; j++) { //para cada columna de la matriz
                if (A[i][j] > major) {
                    major = A[i][j];
                    major_rows = i;
                    major_col = j;
                } else if (A[i][j] < minor) {
                    minor = A[i][j];
                    minor_rows = i;
                    minor_col = j;
                }
            }
        }

        //Mostrar por pantalla el mayor elemento de la matriz,el menor y las posiciones que ocupan
        System.out.print("Elemento mayor: " + major);
        System.out.println(" Fila: "+ major_rows + " Columna: " + major_col);
        System.out.print("Elemento menor: " + minor);
        System.out.println(" Fila: "+ minor_rows + " Columna: " + minor_col);*/
