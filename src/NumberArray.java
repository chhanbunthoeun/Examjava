import java.util.Scanner;
public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial size of the array:");
        int initialSize = scanner.nextInt();

        int[] numbers = new int[initialSize];
        int count = 0;

        System.out.println("Enter numbers a negative number to stop:");

        int input = scanner.nextInt();
        while (input >= 0) {
            if (count == numbers.length) {
                int[] newArray = new int[numbers.length * 2];
                System.arraycopy(numbers, 0, newArray, 0, numbers.length);
                numbers = newArray;
            }
            numbers[count] = input;
            count++;

            System.out.println("Enter next number or negative to stop:");
            input = scanner.nextInt();
        }

        System.out.println("List of numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}

