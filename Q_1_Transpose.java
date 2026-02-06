// PROBLEM 1: TRANSPOSE A MATRIX

import java.util.Scanner;

public class Q_1_Transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int transpose[][] = new int[c][r];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}