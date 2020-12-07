package guess;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What's your name?");

        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }
}
