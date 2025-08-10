import java.util.Scanner;

public class eleventh_project {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Informe quantos numeros deseja digitar:");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero:");
            vet[i] = sc.nextDouble();
        }

        System.out.println("Numeros digitados");
        for (int i = 0; i < N; i++){
            System.out.printf("%.1f%n",vet[i]);
        }
        sc.close();
    }
}

//Utilização de vetores;