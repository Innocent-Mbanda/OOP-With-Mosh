package Functions;

import java.util.Scanner;

public class MongageCalculator {

    public static void main(String[] args) {
        int userInput = 0;
        float interestRate =0;
        float period = 0;
        float mortgage = userInput *interestRate*period/12;
        Scanner scanningUserInput = new Scanner(System.in);



        while (userInput<1000 && userInput<1000_000){
            System.out.println("Enter number between 1K and 1M");
            userInput = scanningUserInput.nextInt();
            System.out.println("Annual Interest rate:");
            while (interestRate<=0)

                System.out.println("Enter number between 1 to 30");
            interestRate =scanningUserInput.nextInt();

//            interestRate =scanningUserInput.nextInt();
//            System.out.println("Interst rate" + interestRate);
//            System.out.println(" Enter the period");
//            period = scanningUserInput.nextInt();
//            System.out.println("Enter number between 1-30");
//            System.out.println("years :" +period);
//            period = scanningUserInput.nextInt();
//
//            System.out.println("Mortgage: " +mortgage);




        }


    }
}
