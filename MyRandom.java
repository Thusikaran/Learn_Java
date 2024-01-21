import java.util.Random;
public class MyRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int x= random.nextInt(8);
        System.out.println(x);
        double y = random.nextDouble(8);
        System.out.println(y);
    }
}
