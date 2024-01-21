import java.util.Scanner;
public class Main {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello and welcome!");
        System.out.println();

        int x=30;
        String name="thusi";
        long num= 7665655L;
        float f= 4.554f;
       // System.out.println(name);

        System.out.println("what is your name :");
        String n = scanner.nextLine();
        System.out.println("your age  :");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("food is : ");
        String food = scanner.nextLine();
        System.out.println("my name is :"+n+"\n you "+age+" years old"+"\n favourite is :"+food);




    }
}