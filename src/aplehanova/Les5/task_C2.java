package aplehanova.Les5;

import java.util.Arrays;
import java.util.Scanner;

public class task_C2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] number=new int[20];
        for (int i = 0; i < number.length; i++) {
            int x = sc.nextInt();
            number[i] = x;
        }
        for(int z=0; z<number.length; z++) {
            for (int y = number.length - 1; y > 0; y--) {
                if (number[y] > number[y - 1]) {
                    int f = number[y];
                    number[y] = number[y - 1];
                    number[y - 1] = f;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
