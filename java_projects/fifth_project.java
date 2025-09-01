package java_projects;

import java.util.Scanner;

public class fifth_project {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int escolha;
        float n1, n2;

        do {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.println("0- Sair");
            escolha = leia.nextInt();

            if (escolha >= 1 && escolha <= 4) {
                System.out.println("Informe 2 numeros:");
                n1 = leia.nextFloat();
                n2 = leia.nextFloat();

                switch (escolha) {
                    case 1:
                        System.out.printf("Soma = %.2f%n", (n1 + n2));
                        break;

                    case 2:
                        System.out.printf("Subtracao = %.2f%n", (n1 - n2));
                        break;

                    case 3:
                        System.out.printf("Multiplicacao = %.2f%n", (n1 * n2));
                        break;

                    case 4:
                        if (n2 == 0f || n2 > n1) {
                            System.out.println("Erro: divisao invalida!");
                        } else {
                            System.out.printf("Divisao = %.2f%n", (n1 / n2));
                        }
                        break;
                }
            } else if (escolha == 0) {
                System.out.println("Thank you, see you soon.");
            } else {
                System.out.println("Opcao invalida! Escolha entre 0 e 4.");
            }

        } while (escolha != 0);

        leia.close();
    }
}
