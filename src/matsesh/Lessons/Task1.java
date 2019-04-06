package matsesh.Lessons;

public class Task1 {
    public static void main(String[] args) {

        int i;
        boolean running = true;

        for(i = 0; i < 10; i++) {
            while(running) {
                break;
            }
            System.out.println("После while");
        }
        System.out.println("После for");
    }
}