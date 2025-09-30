package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ConcatenarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("----- Concatenar palavras e formar uma frase -----");
        String opcao;
        do {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine();
            lista.add(palavra);
            System.out.print("Deseja digitar mais uma palavra? Sim | Não: ");
            opcao = scanner.next();
            scanner.nextLine();
        } while (!opcao.equals("Não"));
        for (String p : lista){
            System.out.print(p + " ");
        }
        scanner.close();
    }
}
