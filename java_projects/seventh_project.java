package java_projects;

import java.util.Scanner;

public class seventh_project {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;

        System.out.print("Informe a temperatura em Celsius: ");
        celsius = leia.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        kelvin = celsius + 273.15;

        System.out.printf("A temperatura em Fahrenheit é: %.2f%n", fahrenheit);
        System.out.printf("A temperatura em Kelvin é: %.2f%n", kelvin);

        leia.close();
    }
}

//Conversor de Temperatura;
//
//Entrada: temperatura em Celsius;
//
//Saída: valor em Fahrenheit e Kelvin;