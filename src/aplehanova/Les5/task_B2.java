package aplehanova.Les5;

import java.util.Arrays;
import java.util.Scanner;

public class task_B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] m=new int[20];

        for (int i = 0; i < m.length; i++) {
            int num=sc.nextInt();
            m[i]=num;
        }
        int[] a=new int[10];
        int[] b=new int[10];
        System.arraycopy(m,0,a,0,10);
        System.arraycopy(m,10,b,0,10);
        System.out.println("a= "+Arrays.toString(a));
        System.out.println("b= "+Arrays.toString(b));


    }
}
