package com.company;

public class Main {

    /*
        Номер залікової книжки 9108
        c2 becomes 0
        o1 becomes +
        C  becomes 0
        c5 becomes 3
        o2 becomes +
        c7 becomes 1
        indexes types become short
     */

    public static void main(String[] args) {
        System.out.println("Okey, there we go!");
        System.out.println();

        double sum = 0;

        try {
            for (short i = a; i <= n; ++i) {
                for (short j = b; j <= m; ++j) {
                    sum += calculateElement(i, j);
                }
            }
        } catch (Exception exception) {
            System.err.println(exception.toString());
        }

        System.out.println(sum);
        System.out.println();
    }

    static double calculateElement(short i, short j) {
        int ij = i + j; // numerator
        int ic = i + C; // denominator
        if (0 == ic) {
            throw new IllegalArgumentException("denominator is zero");
        }
        return (double)ij / ic;
    }

    static short n = 4, m = 4;
    static short a = 2, b = 2;

    static int C = 0;
}
