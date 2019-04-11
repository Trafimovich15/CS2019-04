package aplehanova.Les5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task_C1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> etc = new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            int x = sc.nextInt();
            number.add(x);
        }
        for (Integer y : number) {
            if (y % 2 == 0) {
                if (y % 3 == 0) {
                    odd.add(y);
                    even.add(y);
                }
                else
                    even.add(y);
            }
            else if (y % 3 == 0) {
                odd.add(y);
            }
            else etc.add(y);
        }
        printList(odd);
        printList(even);
        printList(etc);
    }
    private static void printList(List<Integer> list) {
        System.out.println(list);

    }
}
