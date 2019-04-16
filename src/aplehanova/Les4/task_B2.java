package aplehanova.Les4;

import java.util.Scanner;

public class task_B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int i=1;

            while (i <= x) {
                int j=1;
                    while (j<=x) {
                        System.out.printf("%3d", j * i);
                        j++;
                    }
                System.out.println();
                    i++;

            }
    }
}
