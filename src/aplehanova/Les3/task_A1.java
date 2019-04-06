package aplehanova.Les3;

import java.util.Scanner;

public class task_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        double m, n;
        m = a;
        n = b;
        System.out.println(a + b + " " + (a - b) + " " + a * b + " " + a / b + " " + a % b);
        System.out.println(m + n + " " + (m - n) + " " + m * n + " " + m / n + " " + m % n);

    }
}