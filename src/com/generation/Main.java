package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero = sc.nextInt();

        while (numero != 0) {
            factorial = factorial * numero;
            numero = numero - 1;

            System.out.print(factorial); */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = sc.nextInt();
        int n = 1;
        int i = 1;

        do {
            n = n * i;
            i ++;
        }while (i <= numero);
        System.out.println("El numero Factorial es: " + n); */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = sc.nextInt();
        int factorial = 1;
        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);

    }
}
