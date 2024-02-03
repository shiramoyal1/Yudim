//q1
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter a number");
        int num1 = scan.nextInt();
        if (num1 >= 0) {
            System.out.print(num1 + "is positive");
        } else
            System.out.print(num1 + "is negative");
    }
}
//q2
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);


        System.out.print("enter a num");
        int num1 = scan.nextInt();
        System.out.print("enter one more num");
        int num2 = scan.nextInt();

        if (num1 < num2)
        {
            System.out.print(num1 + "is smaller than" + num2);
        }
        else
        {
            System.out.print(num2 + "is smaller than" + num1);
        }
    }
}
//q3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("enter your name");
        int name1 = scan.nextInt();
        System.out.print("enter your name");
        int name2 = scan.nextInt();
        System.out.print("enter speed");
        int v1 = scan.nextInt();
        System.out.print("enter speed");
        int v2 = scan.nextInt();
        System.out.print("enter place");
        int d1 = scan.nextInt();
        System.out.print("enter place");
        int d2 = scan.nextInt();
        if ((d1 * v1) > (d2 * v2)) {
            System.out.print(name1 + "will arrive first");
        } else {
            System.out.print(name2 + "will arrive first");
        }
    }
}

