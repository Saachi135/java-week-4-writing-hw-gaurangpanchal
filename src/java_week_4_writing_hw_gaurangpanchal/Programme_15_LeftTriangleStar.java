package java_week_4_writing_hw_gaurangpanchal;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */
public class Programme_15_LeftTriangleStar {
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++){
            for (j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = scanner.nextInt();
        leftTriangle(a);
        // closing scanner object
        scanner.close();
    }

}
