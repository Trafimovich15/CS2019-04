package aplehanova.Les4;

import java.util.Scanner;

public class task_B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        for(int i=1; sum<=number; i++){
            System.out.print(sum+" ");
            sum+=i;

        }

    }
}
