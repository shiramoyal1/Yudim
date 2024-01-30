//q1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your name");
        String name1 = scan.next();
        System.out.println("enter your name");
        String name2 = scan.next();
        System.out.println("enter your name");
        String name3 = scan.next();
        System.out.println(name1.compareTo(name2));
        System.out.print(name1.compareTo(name3));
        System.out.print(name3.compareTo(name2));
    }
