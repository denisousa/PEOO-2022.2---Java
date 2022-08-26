import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        double number1 = scanner.nextDouble();
        System.out.println("Enter number 2:");
        double number2 = scanner.nextDouble();

        double sum = (number1+number2)/2;
        System.out.println("TOTAL: " + sum);

        if (sum > 7) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
