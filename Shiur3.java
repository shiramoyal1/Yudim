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

//q4
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your grade");
        int grade1 = scan.nextInt();
        System.out.print("enter your 2 grade");
        int grade2 = scan.nextInt();
        System.out.print("enter your 3 grade");
        int grade3 = scan.nextInt();
        System.out.print((grade1 + grade2 + grade3) / 3);
    }
}
//q5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your num");
        int num1 = scan.nextInt();
        System.out.print("enter your2 num");
        int num2 = scan.nextInt();
        System.out.print("enter your 3 num");
        int num3 = scan.nextInt();
        if (num1 < num3 && num1 < num2) {
            System.out.print(num1 + "is the lowest number");
        }
        if (num2 < num1 && num2 < num3) {
            System.out.print(num2 + "is the lowest number");
        }
        if (num3 < num1 && num3 < num2) {
            System.out.print(num3 + "is the lowest numver");
        }
    }
}
//q6 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your x1");
        int x1 = scan.nextInt();
        System.out.print("enter your y1");
        int y1 = scan.nextInt();
        System.out.print("enter your x2");
        int x2 = scan.nextInt();
        System.out.print("enter your y2");
        int y2 = scan.nextInt();
        double d;
        d = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        Math.sqrt(d);
        System.out.print(d);
    }
}
//q9
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("my name is");
        String name = scan.nextLine();
        System.out.print("My school is");
        String school = scan.nextLine();
        System.out.print("the number of subjects i study is");
        int subjects = scan.nextInt();
        System.out.print("my name is" + name);
        System.out.print("my school is"+school);
        System.out.print("the number of subjects i study"+subjects);
}
}
