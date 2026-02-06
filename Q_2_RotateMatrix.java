// PROBLEM 2: ROTATE MATRIX 90 degrees CLOCKWISE

import java.util.Scanner;

public class Q_2_RotateMatrix {
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
        for(int i = c-1; i >= 0; i--){
            for(int j = r-1; j >= 0; j--){
                transpose[i][j] = matrix[r-j-1][i];
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
