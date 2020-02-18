/*
*** Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
(Input a number:  example 8 from a main function)
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

import java.util.Scanner;
//hejsa
public class Main {
    public static void main(String[] args){

        System.out.println("Write a number, and i will print its multiplication table up to 10");
        Scanner keyboard = new Scanner(System.in);
        int intFromUser = keyboard.nextInt();
        String result = multiplicationTable(intFromUser);
        System.out.println("The number's "+intFromUser+ " multiplication table is: \n"+result);

    }
    static String multiplicationTable(int n){
        String result = "";
        for (int i=1; i <= 10; i++){
            result = result + n + "x" + i + "=" + n*i + "\n"; // result += n + "x" + i + "=" + n*i + "\n";
        }
        return result;
    }
}

