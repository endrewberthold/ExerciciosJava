package Exercicios;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Sistema de contagem de caracteres ------");
        System.out.println("Deseja iniciar a operação de contagem? [1] Sim | [2] Não ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        int i = 0;
        while (opcao == 1){
            System.out.println("Digite uma palavra ou frase para contar os caracteres:");
            String texto = scanner.nextLine().trim();
            System.out.println("Quantidade de caracteres: " + texto.length());
            System.out.println("Deseja continuar? [1] Sim | [2] Não ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            i++;
        }
        System.out.print("Operação encerrada pelo usuário.");
        System.out.print("O sistema foi utilizado [" + i + "] vezes");
        scanner.close();
    }

}
