package Exercicios;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i;

        System.out.print("Digite um numero: ");

        for (i = scanner.nextInt(); i <= 100; i++){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
