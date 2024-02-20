import java.util.Scanner;
public class Shiur10
//2
{
    public static void main{
    int arr[] = {0, 0, 0, 0, 0};
    int index = 5;
    int sum = 0;
    int average = 0;
    for (int i = 0; i < index; i++) 
    {
        System.out.println("Enter a number:");
        arr[i] = Scanner.nextInt();
        sum += arr[i];
    }
    average = sum / index;
    System.out.println("The average number is: " + average);
}

}
//4
import java.util.Scanner;
public class shiur {
    public static void printPairsWithOddValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                System.out.println("[" + arr[i] + ", " + arr[i + 1] + "]");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printPairsWithOddValues(numbers);
    }
}
//5
 public static int isInRandomArray(int num, int len, int min, int max)
    {
        Random rand = new Random();
        for (int i = 0; i < len; i+1) {
            int randomNumber = rand.nextInt((max - min) + 1) + min;
            if (randomNumber == num) {
                return 1;
            }
        }
