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
//q2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a sentence till 4 words");
        String str1 = scan.nextLine();
        int size = str1.length();
        System.out.print(size);
    }
}
//q3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your word");
        String str1 = scan.next();
        if (str1.charAt(0) == str1.charAt(2))
            System.out.print("the word is palindom");
        else
            System.out.print("the word is not polidrom");
