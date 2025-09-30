# Java Studies

## Basic concepts

Java é uma linguagem orientada a objetos, e seu comportamento é organizado a partir de comunicação entre classes, que possuem atributos e metodos.

    - Atributos são as características que os objetos do mundo real possuem.
        Ex.: cor, marca, modelo, ano de fabricação, portas, tamanho.
    - Métodos são os comportamentos ou as ações executadas por esses objetos (classes).
        Ex.: acelerar, frear, fazer conversão, dar ré, etc.

```java
public class NomeDoArquivo {
    /*
     * Primeira linha define o que esta sendo iniciado, neste caso, a estrutura de uma classe pela palavra reservada *class*, seguida pelo nome da classe que é o nome do arquivo.
     */
    static void main(String[] args){
        /*
         * Os métodos são declarados, por boa prática, com letras minusculas seguido de parenteses()
         * dentro dos () pode ser inserido argumentos ou parâmetros
         */
        System.out.println("Área que recebe o valor que será renderizado");
        /*
         * *Sout* é um method que escreve na saída padrão do computador o conteudo entre aspas ""
         * */
    }
}

```
Toda a execução do projeto inicia no método <code>main</code>, este é o 'construtor' de toda a aplicação e suas classes.

Declaração de variável

```java
public class DeclaracaoDeVariavel {
    static void main(String[] args){
        int var = 0;
        System.out.println('variável declarada cam valor numerico:');
        System.out.println(var);
        String var = "Texto";
        System.out.println('variável declarada com valor de texto:');
        System.out.println(var);
    }
}
```
