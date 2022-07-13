import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World from the IntelliJ IDE!");
        System.out.println("Please tell me your name");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("Welcome " + str);
    }
}
