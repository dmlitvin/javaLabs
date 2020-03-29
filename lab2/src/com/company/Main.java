package com.company;

public class Main {

    /*
    Номер залікової книжки 9108
    c5  becomes 3
    c7  becomes 1
    c11 becomes 0
    c5  xor : ^
    c7  byte
    c11 Обчислити суму найменших елементів кожного стовпця матриці
     */

    static void printMatrix(byte[][] matrix, int rows, int cols) {
        System.out.println("size: " + rows + "x" + cols);
        for (int y = 0; y != rows; ++y) {
            for (int x = 0; x != cols; ++x) {
                System.out.print(matrix[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int rows = 4, cols = 4;

        byte[][]    matrix1 = new byte[rows][cols], // first matrix
                    matrix2 = new byte[rows][cols], // second matrix
                    matrix3 = new byte[rows][cols]; // resulting matrix

        // first matrix initialization
        for (int y = 0; y != rows; ++y) {
            for (int x = 0; x != cols; ++x) {
                matrix1[y][x] = (byte)(x + y);
            }
        }

        // second matrix initialization
        for (int y = 0; y != rows; ++y) {
            for (int x = 0; x != cols; ++x) {
                matrix2[y][x] = (byte)(x * y);
            }
        }

        System.out.println("matrix1");
        printMatrix(matrix1, rows, cols);
        System.out.println("matrix2");
        printMatrix(matrix2, rows, cols);

        // Xor the matrices into resulting matrix
        for (int y = 0; y != rows; ++y) {
            for (int x = 0; x != cols; ++x) {
                matrix3[y][x] = (byte)(matrix1[y][x] ^ matrix2[y][x]);
            }
        }

        System.out.println("matrix3");
        printMatrix(matrix3, rows, cols);

        System.out.println("now find the sum");

        byte sum = 0;

        for (int x = 0; x != cols; ++x) {
            byte minElement = matrix3[0][x];
            for (int y = 0; y != rows; ++y) {
                minElement = (byte)Math.min(minElement, matrix3[y][x]);
            }
            sum += minElement;
        }

        System.out.println("sum : " + sum);
    }
}
