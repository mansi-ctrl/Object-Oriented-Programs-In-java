/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
name :Mansi dobariya
AU1841131
Description:Matrix add,mul,sub...
*/
package twlecture1;

import java.util.Scanner;

/**
 *
 * @author mansi
 */
public class Matrix {

    int matrix1[][];
    int matrix2[][];
    int rows;
    int cols;

    public Matrix(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.rows = rows;
        this.cols = cols;
    }

}

class matrixText {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Same Number Of colums and Rows(like n* n) For Matrix1 & matrix2:");
        int n = s.nextInt();
        int rows = n, cols = n;
        int matrix1[][] = new int[n][n];

        int matrix2[][] = new int[n][n];

        enterMatrix1Data(s, matrix1, rows, cols);
        enterMatrix2Data(s, matrix2, rows, cols);

        // Print Matrix Data
        printMatrix1(matrix1, rows, cols);
        printMatrix2(matrix2, rows, cols);

        //addition
        addMatrix(matrix1, matrix2, rows, cols);
        //transpose
        transpose(matrix1, matrix2, rows, cols);
//multiply
        multiply(matrix1, matrix2, rows, cols);
    }

    public static void enterMatrix1Data(Scanner s, int[][] matrix1, int rows, int cols) {
        System.out.println("Matrix 1:..");
        System.out.println("Enter Elements row-wise ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }
    }

    public static void enterMatrix2Data(Scanner s, int[][] matrix2, int rows, int cols) {
        System.out.println("Matrix 2:..");
        System.out.println("Enter Elements row-wise ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }
    }

    public static void printMatrix1(int[][] matrix1, int rows, int cols) {
        System.out.println("Matrix 1:..");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + matrix1[i][j] + " ");
            }
            System.out.println("");

        }

    }

    public static void printMatrix2(int[][] matrix2, int rows, int cols) {
        System.out.println("Matrix 2:..");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + matrix2[i][j] + " ");
            }
            System.out.println("");

        }
    }

    public static void addMatrix(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int matrix[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Addition matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void transpose(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int trans1[][] = new int[rows][cols];
        int trans2[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans1[j][i] = matrix1[i][j];
                trans2[j][i] = matrix2[i][j];
            }
        }
        System.out.println("Transpose of Matrix1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + trans1[i][j] + " ");
            }
            System.out.println("");

        }
        System.out.println("Transpose of Matrix 2");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + trans2[i][j] + " ");
            }
            System.out.println("");

        }
    }

    public static void multiply(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int mul[][] = new int[rows][cols];
        if(rows==2){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    mul[i][j]=0;
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Multiply matrix:..");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + mul[i][j] + " ");
            }
            System.out.println("");
        }
    }else if(rows==3){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <cols; j++) {
                    for (int k = 0; k < cols; k++) {
                        mul[i][j]=0;
                        mul[i][j]+= matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Multiply matrix:..");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(" " + mul[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
}
/*
run:
Enter Same Number Of colums and Rows(like n* n) For Matrix1 & matrix2:
2
Matrix 1:..
Enter Elements row-wise 
4
5
7
8
Matrix 2:..
Enter Elements row-wise 
5
4
1
2
Matrix 1:..
 4  5 
 7  8 
Matrix 2:..
 5  4 
 1  2 
Addition matrix
 9  9 
 8  10 
Transpose of Matrix1
 4  7 
 5  8 
Transpose of Matrix 2
 5  1 
 4  2 
Multiply matrix:..
 5 10 
 8 16 

BUILD SUCCESSFUL (total time: 13 seconds)

*/
