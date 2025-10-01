package Exercicios;

import java.util.Scanner;

public class ContadorPares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            int i;
            for (i = num; i <= 100; i+=2){
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Somente numeros pares são permitidos");
        }
        scanner.close();
    }
}