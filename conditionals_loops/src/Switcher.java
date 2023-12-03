import java.util.Scanner;
public class Switcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit! ");
        String fruit = in.next().trim().toLowerCase();

        switch(fruit){
            case "mango" -> System.out.println("its yellow , circular and sweet af");
            case "apple" -> System.out.println("its red, round and shiny. keeps doctors away");
            case "grapes"-> System.out.println("they are tiny and are green or purple");
            case "orange"-> System.out.println("its orange, spherical and divides into sections. very yum.");
            case "watermelon"-> System.out.println("its green on the outside, red and watery on the inside. very good.");
            default -> System.out.println("not my fruit");
        }
    }
}
