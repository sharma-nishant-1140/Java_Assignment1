// PROBLEM 4: MATRIX MULTIPLICATION

import java.util.Scanner;

public class Q_4_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix1[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        int e = sc.nextInt();
        int f = sc.nextInt();
        int matrix2[][] = new int[e][f];
        for(int i = 0; i < e; i++){
            for(int j = 0; j < f; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        if(c != e){
            System.out.println("Invalid !!!");
            return;
        }

        int res[][] = new int[r][f];

        for(int i = 0; i < r; i++){    
            for(int j = 0; j < f; j++){
                for(int k = 0; k < c; k++){
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < f; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
