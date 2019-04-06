package matsesh.Lessons;

public class TaskA2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choise;
        System.out.println("Введи цифру от 1 до 7: ");
        choise = (char) System.in.read();
        switch(choise) {
            case '1' :
                System.out.println("Понедельник"); break;
            case '2' :
                System.out.println("Вторник"); break;
            case '3' :
                System.out.println("Среда"); break;
            case '4' :
                System.out.println("Четверг"); break;
            case '5' :
                System.out.println("Пятница"); break;
            case '6' :
                System.out.println("Суббота"); break;
            case '7' :
                System.out.println("Воскресенье"); break;
            default :
                System.out.println("Такого дня ненеди не существует!");
        }
    }
}
