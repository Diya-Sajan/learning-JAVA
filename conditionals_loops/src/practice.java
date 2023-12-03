import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num:");
        int num = in.nextInt();
        int pro = 1;
        if (num == 0){
            System.out.println(1);
        }
        else{
            for (int i=1; i<=num;i++){
                pro *= i;
            }
        }
        System.out.print(pro);


    }
}
