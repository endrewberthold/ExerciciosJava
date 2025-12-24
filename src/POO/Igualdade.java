package POO;

public class Igualdade {
    public static void main(String[] args) {
        String frase1;
        String frase2;
        String frase3;
        frase1 = new String("Conteudo.");
        frase2 = new String("Conteudo.");
        frase3 = frase1;
        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("R: " + (frase1==frase2));
        System.out.println("R: " + (frase1==frase3));
        System.out.println("R: " + (frase1.equals(frase2)));

    }

}
