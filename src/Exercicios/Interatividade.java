package Exercicios;

import java.util.Scanner;

public class Interatividade {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            if (nome.matches(".*\\d.*") || nome.isEmpty()) {
                throw new IllegalArgumentException("Permitido somente valor de texto.");
            }
            System.out.print("Seja bem vindo a interatividade, " + nome);
        } catch (IllegalArgumentException e) {
            System.out.print("Erro: " + e.getMessage());
        }

    }
}
