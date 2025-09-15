import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter name: ");
        String name = input.nextLine();

        System.out.println("whats your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("any favourite meal?: ");
        String meal = input.nextLine();

        System.out.println("hey " + name);
        System.out.println("i see you are " + age + "years old");
        System.out.println("apparently someone likes " + meal);
    }
}