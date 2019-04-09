package aplehanova.Les4;

import java.util.Scanner;

public class task_C1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Какую вы хотите зарплату в $$$?");
        int money=sc.nextInt();
        if(money<300 | money>3000){
            System.out.println("Мы вам перезвоним!");
        }
        else {
           for(int month=0; month<=14; month++) {
                if (month == 0 | month == 13 | month == 14) {
                    System.out.println(0.0);
                }
                else if(month==6 | month==7 | month==8) {

                    switch (month) {
                        case 6:
                            System.out.println(money + " - июнь");

                            break;
                        case 7:
                            System.out.println(money + " - июль");
                            break;
                        case 8:
                            System.out.println(money + " - август");
                            break;
                    }
                    if(money==666) break;
                }
                else{
                    System.out.println(money + money*0.5);
                    if(money+money*0.5==666) break;
                }

            }
        }
    }
}
