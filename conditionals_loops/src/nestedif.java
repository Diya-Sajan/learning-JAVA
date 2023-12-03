import java.util.Scanner;
public class nestedif {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID){
            case 1:
                System.out.println("Diya sajannnn");
                break;
            case 2:
                System.out.println("Disha SAjan");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("it me hu maiiiii");
                        break;
                    case "man":
                        System.out.println("management me hu maaaiiiii");
                        break;
                    case "cloud":
                        System.out.println("you on a fukin cloud mi lord!");
                }
        }


    }
}
