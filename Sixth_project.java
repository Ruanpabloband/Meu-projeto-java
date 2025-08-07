import java.util.Scanner;
import java.lang.Math;

public class Sixth_project {
    public static void main(String[] args) {

        double Imc, peso, altura;
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        peso = leia.nextDouble();

        System.out.println("Informe sua altura:");
        altura = leia.nextDouble();

        Imc = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC e: %.2f%n", Imc);
        leia.close();
    }
}

//Calculo do IMC;
//Formula: Imc = peso / (Altura^2);