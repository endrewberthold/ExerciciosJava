package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println
                ("---- Calcular média do aluno ----");
        double nota;
        String opcao;
        do{
            System.out.print("Digite uma nota A: ");
            nota = scanner.nextDouble();
            notas.add(nota);
            System.out.print("Digite uma nota B: ");
            nota = scanner.nextDouble();
            notas.add(nota);
            System.out.print("Digite uma nota C: ");
            nota = scanner.nextDouble();
            notas.add(nota);
            System.out.print("Confirmar operação? Sim | Não ");
            opcao = scanner.next();
            scanner.nextLine();
            if (opcao.equals("Não")) {
                System.err.print("Operação encerrada pelo usuário");
                return;
            }
        } while (!opcao.equals("Sim"));
        System.out.println("Nota: " + notas);
        double soma = 0;
        for (double n : notas){
            soma += n;
        }

        int index = notas.size();

        double media = soma / index;

        System.out.printf("A média do aluno é: %s ", media);
    }
}
