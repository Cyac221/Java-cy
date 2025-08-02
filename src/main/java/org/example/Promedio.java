package org.example;

import java.util.Scanner;

public class Promedio {
    // metodo para leer un vector de enteros, de tamaño N
    public int []leerVector(int n){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero " + (i+1) + " ");
            numero[i] =scanner.nextInt();
        }
        return numero;
    }
}
