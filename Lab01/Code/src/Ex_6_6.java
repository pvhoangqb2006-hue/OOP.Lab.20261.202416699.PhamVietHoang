import java.util.Scanner;

public class Ex_6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the column size of matrix: ");
        int col = scanner.nextInt();
        System.out.print("Enter the row size of matrix: ");
        int row= scanner.nextInt();


        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("The result is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

