package Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysMain {
    /*
    We use arrays to store a list of items such as number, people, items
     */
    public static void main(String []args){

        String role ="Admin";

        switch (role){
            case "Admin":
                System.out.println("You are admin");
                break;

            case "moderator":
                break;

            case "guest":
                System.out.println("you are guest");
                break;
            default:
                System.out.println("you are student");
        }
    }


}
