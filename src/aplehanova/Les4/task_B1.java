package aplehanova.Les4;

import java.util.Scanner;

public class task_B1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите год:");
        int x=sc.nextInt();{
            if(x%100==0 & x%400==0 | x%4==0 & x%100!=0) {
                System.out.println("Количество дней в году: 366");
            }
            else{
                System.out.println("Количество дней в году: 365");

            }
        }
    }
}
