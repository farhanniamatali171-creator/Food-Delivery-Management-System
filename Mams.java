import java.util.Scanner;

public class Mams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 30};

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();
            int a = Integer.parseInt(input1);

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();
            int b = Integer.parseInt(input2);

            // Nested try block (tricky part)
            try {
                int result = a / b;
                System.out.println("Division result: " + result);

                System.out.print("Enter index (0-2): ");
                int index = sc.nextInt();

                System.out.println("Array value: " + numbers[index]);

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero!");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");

        } catch (Exception e) {
            System.out.println("General error occurred: " + e);

        } finally {
            System.out.println("Program ended (finally block executed).");
            sc.close();
        }
    }
}