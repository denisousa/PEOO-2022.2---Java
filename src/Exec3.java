import java.util.*;

public class Exec3 {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 7; i++) {
            System.out.println(String.format("Enter number %s: ", i));
            String number = scanner.nextLine();
            numbersList.add(Integer.parseInt(number));
        }

        System.out.println("Enter X: ");
        Integer xValue = scanner.nextInt();

        for (Integer number : numbersList) {
            if (number == xValue) System.out.println(String.format("Find X (%s) in List", xValue));
        }

        Collections.sort(numbersList);
        System.out.println(numbersList);
    }
}
