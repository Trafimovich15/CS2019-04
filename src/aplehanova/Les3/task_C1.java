package aplehanova.Les3;

import java.util.Scanner;

public class task_C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertoFharenhet(sc.nextInt()));
    }

    public static double convertoFharenhet(int TC) {
        double TF=(TC*9/5)+32;
        return TF;

    }
}
