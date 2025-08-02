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
    //Hallar el promedio de los elementos del vector
    //Se llama igual el vector pero no es el mismo
    public float hallarPromedio(int n, int[] numero){
        float promedio, acumulador_elementos=0;
        for (int i = 0; i < n; i++) {
            acumulador_elementos = acumulador_elementos + numero[i];
        }
        promedio = acumulador_elementos / n;

        return promedio;

    }
}
