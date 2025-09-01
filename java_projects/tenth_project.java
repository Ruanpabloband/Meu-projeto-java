package java_projects;

import java.util.Scanner;

public class tenth_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n, x, soma;
        soma = 0;

        System.out.print("Informe a quantidade de numeros digitados:");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            System.out.print("Digit um numero:");
            x = sc.nextInt();

            soma = soma + x;
        }

        System.out.printf("Soma = " + soma);
    }
}

//Utilizando a estrutura de repetição "for";