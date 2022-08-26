import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        List<Integer> agesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println(String.format("Enter name %s: ", i));
            String name = scanner.nextLine();
            System.out.println(String.format("Enter age %s: ", i));
            String age = scanner.nextLine();
            namesList.add(name);
            agesList.add(Integer.parseInt(age));
        }

        int minAge = Integer.MAX_VALUE;
        for(Integer age : agesList) {
            if (age < minAge) minAge = age;
        }

        for(int i = 0; i < 5; i++) {
            if (minAge == agesList.get(i)) {
                System.out.println("(MIN) AGE: " + agesList.get(i));
                System.out.println("(MIN) NAME: " + namesList.get(i));
                break;
            }
        }

        int maxAge = Integer.MIN_VALUE;
        for(Integer age : agesList) {
            if (age > maxAge) maxAge = age;
        }

        for(int i = 0; i < 5; i++) {
            if (maxAge == agesList.get(i)) {
                System.out.println("(MAX) AGE: " + agesList.get(i));
                System.out.println("(MAX) NAME: " + namesList.get(i));
                break;
            }
        }
    }
}
