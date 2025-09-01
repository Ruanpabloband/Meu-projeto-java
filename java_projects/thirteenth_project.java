package java_projects;

import java.util.Scanner;

public class thirteenth_project {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double area, perimetro, altura, base, diagonal;

        System.out.print("Informe a base:");
        base = sc.nextDouble();

        System.out.print("Informe a altura:");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println("AREA: " + String.format("%.4f", area));
        System.out.println("PERIMETRO: " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL: " + String.format("%.4f", diagonal));
        sc.close();
    }
}

//RESOLUÇÃO DE EXERCICIOS