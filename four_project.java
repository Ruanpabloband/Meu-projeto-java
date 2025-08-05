import java.util.Scanner;

public class four_project {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;
        double saldo1, saldo2;
        char sexo;

        System.out.println("Informe seu nome completo, pessoa 01:");
        nome1 = leia.nextLine();
        System.out.println("Informe sua idade, pessoa 01:");
        idade1 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe seu saldo, pessoa 01:");
        saldo1 = leia.nextDouble();
        leia.nextLine();

        System.out.println("Informe seu nome completo, pessoa 02:");
        nome2 = leia.nextLine();
        System.out.println("Informe sua idade, pessoa 02:");
        idade2 = leia.nextInt();
        leia.nextLine();
        System.out.println("Informe seu saldo, pessoa 02:");
        saldo2 = leia.nextDouble();
        leia.nextLine();

        System.out.println("Informe seu sexo (F/M):");
        sexo = leia.next().charAt(0);

        System.out.println("\nResumo dos dados:");
        System.out.println("Pessoa 01: " + nome1 + " | Idade: " + idade1 + " | Saldo: " + saldo1);
        System.out.println("Pessoa 02: " + nome2 + " | Idade: " + idade2 + " | Saldo: " + saldo2);
        System.out.println("Sexo informado: " + sexo);

        leia.close();
    }
}
