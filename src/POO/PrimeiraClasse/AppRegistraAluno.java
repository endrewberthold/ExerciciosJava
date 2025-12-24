package POO.PrimeiraClasse;

import java.util.Scanner;

public class AppRegistraAluno {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Registro e Alunos ---");
        Scanner sc = new Scanner(System.in);
        RegistrarAluno regAluno = new RegistrarAluno();
        String opcao;
        do {
            System.out.print("Digite o nome: ");
            regAluno.setNome(sc.nextLine());
            System.out.print("Digite o endereço: ");
            regAluno.setEndereco(sc.nextLine());
            System.out.print("Digite a idade: ");
            regAluno.setIdade(sc.nextInt());
            System.out.print("Digite a nota de Matemética: ");
            regAluno.setNotaMatematica(sc.nextDouble());
            System.out.print("Digite a nota do Geografia: ");
            regAluno.setNotaGeografia(sc.nextDouble());
            System.out.print("Digite a nota de Portugues: ");
            regAluno.setNotaPortugues(sc.nextDouble());
            System.out.printf("""
                    Nome: %s
                    Endereço: %s
                    Idade: %d
                    Media: %.2f
                    """, regAluno.getNome(),
                    regAluno.getEndereco(),
                    regAluno.getIdade(),
                    regAluno.getMedia());
            System.out.println("Deseja confirmar? Y | N");
            opcao = sc.next();
            opcao = opcao.toUpperCase();
        } while (opcao.equals("N"));
        System.out.println("Aluno Cadastrado com sucesso!");
        System.out.println("Alunos Cadastrados: " + RegistrarAluno.getContadorAluno());
        sc.close();
    }
}
