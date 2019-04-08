package aplehanova.Les3;

import java.util.Scanner;

public class task_B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Enter number c:");
        int c = sc.nextInt();
        int D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("корень 1=" + x1 +" "+"корень 2=" + x2);
        }
        else if (D == 0) {
            double x;
            x = (-b / 2 * a);
            System.out.println("корень x=" + x);
        }
        else {
            System.out.println("отрицательный дискриминант");
        }


    }
}
