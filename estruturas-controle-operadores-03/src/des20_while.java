import java.util.Scanner;

public class des20_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (sum < 100) {
            System.out.println("Enter a number: ");
            number = input.nextInt();
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
