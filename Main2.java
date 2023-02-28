import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть двозначне число: ");
        int number = scanner.nextInt();
        int sum = (number % 10) + (number / 10);
        System.out.println("Сума цифр числа " + number + " дорівнює " + sum);
    }
}

