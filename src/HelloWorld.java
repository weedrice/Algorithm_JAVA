import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        for(int i=2;i<10;i++) {
            for(int j =1 ; j < 10; j ++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        Random random = new Random();
        int x = random.nextInt(6) + 1;
        System.out.println("x = " + x);
    }
}
