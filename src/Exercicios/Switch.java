package Exercicios;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Estrutura Condicional Switch ---");
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um operador: ");
        String operador = scanner.next();
        System.out.println("Digite um numero para finalizar a operação: ");
        int num2 = scanner.nextInt();

        int res = 0;
        switch(operador){
            case "+":
                res = num1 + num2;
                System.out.println("Resultado da soma: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Resultado da subtração: " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Resultado da divisão: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Resultado da multiplicação: " + res);
                break;
            case "**":
                res = num1 ^ num2;
                System.out.println("Resultado da exponenciação: " + res);
                break;
            case "%":
                res = num1 % num2;
                System.out.println("Resultado do modulo: " + res);
                break;
            default:
                System.out.println("Operação não suportada.");
                break;
        }

        scanner.close();
    }
}
