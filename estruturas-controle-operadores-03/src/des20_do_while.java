import java.util.Scanner;

public class des20_do_while {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer = 1;
        int number;
        int evens = 0;
        int odds = 0;

        do {
            System.out.print("Gimme a number: ");
            number = input.nextInt();

            if (number % 2 == 0) {
                evens += number;
            } else {
                odds += number;
            }

            System.out.print("Type 1 to continue. ");
            answer = input.nextInt();
        } while (answer == 1);

        System.out.println();
        System.out.println("Total even numbers: " + evens);
        System.out.println("Total odd numbers: " + odds);
    }

}
