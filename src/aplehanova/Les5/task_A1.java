package aplehanova.Les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_A1 {
    public static void main(String[] args) throws IOException {
        BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = list.length-1; i >=0; i--) {
            String s=number.readLine();
            list[i] = Integer.parseInt(s);
        }
        for (int x : list)
            System.out.println(x);
    }
}
