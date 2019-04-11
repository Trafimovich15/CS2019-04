package aplehanova.Les5;

import java.util.ArrayList;

public class task_B1 {
    public static void main(String[] args) {
        ArrayList<String> text= new ArrayList<>();
        text.add("Hellow");
        text.add("world!");
        text.add("How");
        text.add("are");
        text.add("you?");
        System.out.println(text.size());
        for (int i = 5; i >0; i--) {
            int x=text.size()-i;
            System.out.println(text.get(x));


        }
    }
}
