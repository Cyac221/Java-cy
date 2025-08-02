package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciar clases
        Scanner scanner = new Scanner(System.in);
        Promedio promedio = new Promedio();
        //Definir variables

        int n;
        //Leer el tamaño del vector
        System.out.print("Cuantos elementos tiene el vector?  ");
        n = scanner.nextInt();
        int[] numero=new int[n];
        
        //Leer escanner

        numero=promedio.leerVector(n);

    }
}