package java_projects;

import java.util.Scanner;

public class ninth_project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, soma;

        soma = 0;

        System.out.print("Digite o primeiro numero: ");
        n = sc.nextInt();

        while (n != 0) {
            soma = soma + n;

            System.out.print("Digite outro numero:");
            n = sc.nextInt();

        }

        System.out.printf("Soma = " + soma);
        sc.close();

    }
}

//Uso da estrutura de repetição "While";