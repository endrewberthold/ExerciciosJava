package Exercicios;

public class ArrayForOneBase {
    public static void main(String[]args){
        int[] num = new int[100];
        for(int i = 0; i<num.length; i++){
            num[i] = i + 1;
            System.out.println(num[i]);
        }
    }
}
