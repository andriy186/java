import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentFloor = 1; // Початковий поверх - 1

        while (true) {
            System.out.print("Ви знаходитесь на поверсі " + currentFloor + ". Будь ласка, введіть номер поверху, на який ви бажаєте піднятись або спуститись (1-9): ");
            int selectedFloor = scanner.nextInt();

            if (selectedFloor < 1 || selectedFloor > 9) {
                System.out.println("Ви ввели неправильний номер поверху. Будь ласка, введіть число в діапазоні від 1 до 9.");
                continue; // Починаємо цикл спочатку
            }

            if (selectedFloor == 2) {
                System.out.println("Кнопка 2-го поверху не працює. При натисканні на неї під час підйому ліфт доставлятиметься на 3-й поверх.");
                selectedFloor = 3; // Замінюємо вибір користувача на 3-й поверх
            }

            if (selectedFloor > currentFloor) {
                System.out.println("Ви піднялись на " + (selectedFloor - currentFloor) + " поверхів.");
            } else if (selectedFloor < currentFloor) {
                System.out.println("Ви спустились на " + (currentFloor - selectedFloor) + " поверхів.");
            } else {
                System.out.println("Ви залишаєтесь на поточному поверсі.");
            }

            currentFloor = selectedFloor; // Оновлюємо поточний поверх
        }
    }
}
