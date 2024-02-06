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


//q4
        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string");
        String str1 = scan.nextLine();
        int inputString = 0;
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("the reverse str is" + reversedString);
    }
}
//q5
        System.out.print("Enter a four latters string: ");
        String str = scanner.nextLine();
        String correctedStr = "";
        char firstChar = str.charAt(0);
        if (firstChar == 'u' || firstChar == 'o' || firstChar == 'i' || firstChar == 'e' || firstChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += firstChar;
        }
        char secondChar = str.charAt(1);
        if (secondChar == 'u' || secondChar == 'o' || secondChar == 'i' || secondChar == 'e' || secondChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += secondChar;
        }
        char thirdChar = str.charAt(2);
        if (thirdChar == 'u' || thirdChar == 'o' || thirdChar == 'i' || thirdChar == 'e' || thirdChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += thirdChar;
        }
        char fourthChar = str.charAt(3);
        if (fourthChar == 'u' || fourthChar == 'o' || fourthChar == 'i' || fourthChar == 'e' || fourthChar == 'a')
        {
            correctedStr += '*';
        }
        else
        {
            correctedStr += fourthChar;
        }
        System.out.println("Corrected string: " + correctedStr);

//q6
        import java.util.Scanner;
public class Main {
    public static <scan> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a num =<100");
        int Num = scan.nextInt();
        if (Num < 10) {
            System.out.println("the number is a one digit number");
        }
        if (Num >= 10) {
            System.out.println("the number is a two digit number");
        }
        if (Num%2==0)
        {
            System.out.println("shared at two");
        }
        if (Num%3==0)
            System.out.println("shared at three");
    }
}

//q7
    import java.util.Scanner;
public class Main {
    public static <scan> void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a x");
        int x1 = scan.nextInt();
        System.out.print("enter a y");
        int y1 = scan.nextInt();
        System.out.print("enter a x2");
        int x2 = scan.nextInt();
        System.out.print("enter a y2");
        int y2 = scan.nextInt();
        System.out.print((x1 - x2) * (x1 - x2) + (y1 - y2));
    }
}
