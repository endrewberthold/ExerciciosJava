package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Digite dez números inteiros ---");
        int[] numeros;
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        sc.close();
        System.out.println(Arrays.toString(numeros));
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
