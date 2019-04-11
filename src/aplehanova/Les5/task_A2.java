package aplehanova.Les5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task_A2 {
    public static void main(String[] args) throws IOException {
        BufferedReader list = new BufferedReader(new InputStreamReader(System.in));
        ArrayList word=new ArrayList();

        for(;;){
            String s=list.readLine();

            if (s.equals("End")) break;
            else {
                word.add(s);
            }
        }
        System.out.println(word);
    }
}
