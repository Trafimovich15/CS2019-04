package aplehanova.Les3;

import java.util.Scanner;

public class task_C2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sumDigitsInNumber(sc.nextInt()));
    }

    public static int sumDigitsInNumber(int number) {
        int x=0;
        while (number > 0) {
            x += number % 10;
            number=number/10;

        }
        return x;
    }
}
