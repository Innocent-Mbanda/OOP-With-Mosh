package Functions;

import javax.crypto.spec.PSource;
import java.awt.*;
import java.util.Date;

public class Main {
    /*
    What is a function?
    a function is a block of code that performs a task.

    What we are covering in this picture.
    -Variables
    -Primitive and reference type of
    -casting
    -reading inputs from user

    VARIABLES:
    What is variables: We use variables to stored data in computers momory.
    eg int age = 30;
    int myAge =31

    DATA TYPE IN JAVA
    -PRIMITIVE for storing simple value.
    Byte: Which takes one byte of memory where we can store values from -128 to 127
    Short: takes 2 bytes of memory and store from -32k to 32k
    int : which takes 4 bytes of memory and can store about 2Billion
    Long: which takes 8 bytes of memory;
    STORING DATA IN MEMORY

    for decimal numbers we use float or double
    for a single character we use char
    for True or false, we use boolean.




    -REFERENCE: to store complex values such as date objects, mail objects.

     */


    public static void main(String[] args) {

        String message = "Hello world";
        System.out.println(message.length());
        if (message.length() >10){
            System.out.println("wrong name");
        } else {
            System.out.println(message);
        }


    }
}
