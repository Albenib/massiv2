import java.lang.Math;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int m = 4, n = 4;

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                arr[i][j] = 1 + (int) (Math.random() * 98);

                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.print("a: ");

        int a = cin.nextInt();

        boolean s = false;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if(i > j && arr[i][j] == a) s = true;

            }

        }

        if (s) System.out.println("Bar");

        else System.out.println("Joq");

    }

}