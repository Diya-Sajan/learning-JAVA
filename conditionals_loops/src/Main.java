import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op =='+' || op =='-' || op =='*' || op =='/' || op =='%') {
                int a = in.nextInt();
                int b = in.nextInt();
                int ans = 0;

                if (op == '+') {
                    System.out.println(a + b);
                }
                if (op == '-') {
                    System.out.println( a - b);
                }
                if (op == '*') {
                    System.out.println(a * b);
                }
                if (op == '/') {
                    System.out.println(a / b);
                }
                if (op == '%') {
                    System.out.println( a% b);
                }

            }
            else if ( op == 'x' || op =='X'){
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
        }
    }
}