package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ForContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("------ Checar valores iguais ------");
        String opcao;
        do {
            System.out.println("Digite um nome: ");
            String nome = scanner.nextLine();
            lista.add(nome);
            System.out.println(lista);
            System.out.println("Deseja adicionar mais um valor? Sim | Não");
            opcao = scanner.next();
            scanner.nextLine();
        } while (!opcao.equals("Não"));
        System.out.println("----- Operação encerrada -----");
        System.out.println("Lista: " + lista);
        int count = 0;
        for (String n : lista) {
            if (!n.equals("Endrew")) {
                continue;
            }
            count++;
        }
        System.err.println("Encontrado " + count + " vezes o nome Endrew na lista.");
        scanner.close();
    }
}
