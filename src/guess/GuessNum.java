package guess;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class GuessNum {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Random random = new Random();




        String name = askName("Your name is ");




        do {







            int myNum = random.nextInt(100) + 1;

            System.out.println("Im thinking of number from 1 to 100, try to guess it");
            boolean userWin = false;

            for (int attempt = 1; attempt <= 10; attempt++) {
                System.out.printf("Attempt #%d \n ", attempt);
                int userNum = askNumber("Your guess" , 1, 100);


                if (myNum > userNum) {
                    System.out.println("Your number is too low");
                } else if (myNum < userNum) {
                    System.out.println("Your number is too high");
                } else if (myNum == userNum) {
                    System.out.printf("You won! %d attempts were used.\n", attempt);
                    userWin = true;
                    break;
                }

            }
            if (!userWin) {
                System.out.printf("You lost! My number was %d\n", myNum);
            }


        } while (askYesOrNo("do you want to play again?"));
        System.out.println("Good bye " + name);


    }
    public static int askNumber(String msg, int min, int max){

        while(true) {
            System.out.print(msg + ":");

            try {
                int result = scanner.nextInt();

                if (result < min) {
                    System.err.println("Number should not be less than " + min);
                    continue;
                } else if (result > max) {
                    System.err.println("Number should not be high than " + max);
                    continue;
                }

                return result;
            }catch (InputMismatchException e) {
                String input = scanner.next();
                System.out.println("This is not a number");

            }
        }


    }


    public static String askName (String msg){
        System.out.println("Enter your name");
        String name = scanner.nextLine();


            System.out.println("Your name is " + name );




        return name;
    }


    public static boolean askYesOrNo(String msg) {
        while(true) {
            System.out.println("want to play game?yes/no");



        String answer = scanner.next ();
        
        if (answer.equals("yes")){
            return true;

        }else if (answer.equals ("no")){
            return false;


        }



    }
    }
    }


