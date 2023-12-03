//      Write a program to print whether a number is even or odd, also take input from the user.
//      Take name as input and print a greeting message for that particular name.
//       Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//      Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//      Take 2 numbers as input and print the largest number.
//      Input currency in rupees and output in USD.
//      To calculate Fibonacci Series up to n numbers.
//      To find out whether the given String is Palindrome or not.
//    To find Armstrong Number between two given number.

import java.util.Scanner;

public class evod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter num");
        int num = input.nextInt();

        int i = 0;
        int x = 1;
        int z = 1;

        while(z <= num){
            System.out.print(z +" ");
            z=x+i;
            i = x;
            x = z;

        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("enter p");
//        int p = input.nextInt();
//        System.out.println("enter t");
//        int t = input.nextInt();
        // 1 1 2 3 5 8 13



//        if(ren%2==0){ System.out.println("even");}
//        else { System.out.println("odd");}


    }
}
