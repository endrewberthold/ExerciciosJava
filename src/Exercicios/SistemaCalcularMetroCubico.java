package Exercicios;

import java.util.Scanner;

public class SistemaCalcularMetroCubico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("------ Sistema de calculo para construção de piscinas ------");
        System.out.print("\nDigite o comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.print("\nDigite a largura: ");
        double largura = scanner.nextDouble();

        System.out.print("\nDigite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("\nDigite a preço do m³: ");
        double precoMetroCubico = scanner.nextDouble();

        double volume = comprimento * largura * altura;

        double preco = volume * precoMetroCubico;

        System.out.print("\n----- Resultado ------");
        System.out.print("\nMetro calculado: " + volume + "\nValor do m³: R$" + precoMetroCubico + "\nValor total da piscina: R$ " + preco);
        scanner.close();
    }


}
