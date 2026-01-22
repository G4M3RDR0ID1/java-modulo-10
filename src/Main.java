import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo a minha tarefa!\nEscolha qual exercicio gostaria de corrigir primeiro:");
        System.out.println("1: Primeiro Exercício\n2: Segundo Exercício\n3: Terceiro Exercício");
        menuExercicios();

    }

    public static void menuExercicios(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Opção escolhida: ");
        int escolhaMenu = sc.nextInt();
        System.out.println();
        if(escolhaMenu == 1) {
            //EXERCÍCIO 1
            System.out.println("Primeiro Exercício");
            ordenarVetor();
        } else if(escolhaMenu == 2) {
            //EXERCÍCIO 2
            System.out.println("Segundo Exercício");
            processarVetorParImpar();
        } else if(escolhaMenu == 3) {
            //EXERCÍCIO 3
            System.out.println("Terceiro Exercício");
            inverterNome();
        } else {
            System.out.println("Opção escolhida invalida.");
        }
        sc.close();
        //OBs: Se nao for uma IA que vai corrigir minha atividade, consegue colocar uma carinha ":D" quando der um feedback na minha atividade?
    }

    public static void inverterNome(){
        //    EXERCÍCIO 3
        //    Receba um nome qualquer do usuário.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        //    Percorra esse nome num vetor e exiba o vetor com o nome invertido.
        char[] nomeEmVetor = nome.toCharArray();
        for (int i = 0; i < nomeEmVetor.length / 2; i++) {
            int posicaoEspelhada = (nomeEmVetor.length - 1) - i;
            char aux = nomeEmVetor[i];
            nomeEmVetor[i] = nomeEmVetor[posicaoEspelhada];
            nomeEmVetor[posicaoEspelhada] = aux;

        }
        String nomeEmVetorInvertido = String.valueOf(nomeEmVetor);
        System.out.println("O nome invertido fica assim: " + nomeEmVetorInvertido);
        sc.close();
    }

    public static void ordenarVetor(){
        //    EXERCÍCIO 1
//
//    Preencha um vetor de n números com valores aleatórios advindos do console.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para ser o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero que deseja que fique no indice " + i);
            vetor[i] = sc.nextInt();
        }
//    Ordene este vetor.
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i; j < vetor.length; j++) {
                if(vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("Seu vetor ordenado de forma Crescente: " + Arrays.toString(vetor));
//    Em seguida, receba um nome e exiba na tela a quantidade de vogais que esse nome possui.
        sc.nextLine();
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        char[] caracteresDoNome = nome.toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int quantidadeDeVogais = 0;

        for (int i = 0; i < caracteresDoNome.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                if(caracteresDoNome[i] == vogais[j]) {
                    quantidadeDeVogais++;
                }
            }
        }
        System.out.println("A nome tem " + quantidadeDeVogais + " vogais!");

        sc.close();
    }

    public static void processarVetorParImpar(){
        Scanner sc = new Scanner(System.in);
        //EXERCÍCIO 2
        //Receba um vetor de n números inteiros inseridos pelo usuário.
        System.out.println("Digite um numero para ser o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero que deseja que fique no indice " + i);
            vetor[i] = sc.nextInt();
        }
        //Percorra o vetor altere o valor de cada posição:
        for (int i = 0; i < vetor.length; i++) {
            //se o valor da posição for par, seu novo valor deve ser multiplicado por 2
            if(vetor[i] % 2 == 0){
                vetor[i] = vetor[i] * 2;
            }
            //se for ímpar, o novo valor da posição deve ser ele mesmo elevado por 2.
            else {
                vetor[i] = (int) Math.pow(vetor[i], 2);
            }
        }

        System.out.println("Resultado: " + Arrays.toString(vetor));
        sc.close();
    }

}
