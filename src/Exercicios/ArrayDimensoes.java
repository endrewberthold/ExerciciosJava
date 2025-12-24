package Exercicios;

public class ArrayDimensoes {
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println("Laço while");
        int i = 0;
        while (i < dias.length) {
            System.out.println(dias[i]);
            i++;
        }

        System.out.println(" ");

        System.out.println("Laço do-while");
        i = 0;
        do{
            System.out.println(dias[i]);
            i++;
        } while(i < dias.length);

        System.out.println(" ");

        System.out.println("Laço for");
        for(String dia: dias){
            System.out.println(dia);
        }
    }
}
