import java.util.Scanner;

public class twelfth_project {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int l, c;
        System.out.print("Quantas linhas vai ter a matriz? ");
        l = sc.nextInt();

        System.out.print("Quantas colunas vai ter a matriz? ");
        c = sc.nextInt();
        System.out.println();


        int [][] Mat = new int[l][c];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                Mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("MATRIZ DIGITADA:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

//Utilização de matrizes;