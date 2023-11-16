import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        System.out.println("How are you ........");
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Please Enter ur name");
            String a = s.nextLine();
            System.out.println(a);
        }

    }
}
