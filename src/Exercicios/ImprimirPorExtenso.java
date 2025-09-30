package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ImprimirPorExtenso {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Zero");
        lista.add("Um");
        lista.add("Dois");
        lista.add("Três");
        lista.add("Quatro");
        lista.add("Cinco");
        lista.add("Seis");
        lista.add("Sete");
        lista.add("Oito");
        lista.add("Nove");
        lista.add("Dez");

        System.out.println("------ Nome do valor por extenso -----");
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        if (num >= 0 && num < lista.size()){
            System.out.println("Por extenso: " + lista.get(num));
        } else {
            System.out.println("Valor fora do intervalo");
        }
    }
}
