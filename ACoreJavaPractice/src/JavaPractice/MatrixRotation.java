package JavaPractice;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Read input
		System.out.print("Enter the size of Array");
        int M = scanner.nextInt();
        int[][] matrix = new int[M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
            	System.out.print("Enter the"+i+","+j+" index value:");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the nos of rotation:");
        int rotations = scanner.nextInt();

        // Rotate the matrix
        int[][] rotatedMatrix = rotateMatrix(matrix, rotations);

        // Print the rotated matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] matrix, int rotations) {
        int n = matrix.length;
        for (int r = 0; r < rotations; r++) {
            int[][] newMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    newMatrix[n - j - 1][i] = matrix[i][j];
                }
            }
            matrix = newMatrix;
        }
        return matrix;
    }
}



