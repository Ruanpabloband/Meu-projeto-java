package java_projects;

import java.util.Scanner;

public class eighth_project {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu cpf:");
        String cpf = leia.nextLine();

        String apenasDigitos = cpf.replaceAll("\\D", "");

        if (apenasDigitos.length() == 11 && apenasDigitos.matches("\\d{11}")) {
            System.out.println("Numero do CPF valido!!!");
        } else {
            System.out.println("Numero de CPF invalido!!!");
        }

        leia.close();
    }
}

//Validador de CPF (básico);
//
//Entrada: uma String com um CPF;
//
//Saída: se tem 11 dígitos numéricos e está no formato correto;