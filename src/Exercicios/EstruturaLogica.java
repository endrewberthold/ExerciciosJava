package Exercicios;

import java.util.Scanner;

public class EstruturaLogica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = scanner.nextDouble();
        if (nota >= 6 && nota <= 10) {
            System.out.print("Parabens, voce passou na disciplina.");
        } else if (nota <= 5.9 && nota >= 4){
            System.out.println("Recuperação");
            do {
                System.out.println("Digite uma nota  de recuperação: ");
                nota = scanner.nextDouble();

            } while (nota < 6);
            System.out.print("Você foi aprovado na disciplina, nota atual: " + nota);
        } else {
            System.out.println("Você foi reprovado na disciplina");
        }
        scanner.close();
    }
}
