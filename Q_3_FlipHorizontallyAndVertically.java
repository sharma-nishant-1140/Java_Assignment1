// PROBLEM 3: FLIP A MATRIX HORIZONTALLY OR VERTICALLY

import java.util.Scanner;

public class Q_3_FlipHorizontallyAndVertically {
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

        char ch = sc.next().charAt(0);
        int flipped[][] = new int[r][c];
        if(ch == 'H'){
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    flipped[i][j] = matrix[r-i-1][j];
                }
            }
        }
        else{
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    flipped[i][j] = matrix[i][c-j-1];
                }
            }
        }

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(flipped[i][j] + " ");
            }
            System.out.println();
        }
    }
}
