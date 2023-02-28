import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// отримання числа з консолі
        System.out.print("Введіть дійсне число: ");
        double number = scanner.nextDouble();
// визначення дробової частини числа
        double fractionalPart = number - (int) number;
// порівняння дробової частини з 0,5 та округлення числа до найближчо
        int roundedNumber;
        if (fractionalPart >= 0.5) {
            roundedNumber = (int) number + 1;
        } else {
            roundedNumber = (int) number;
        }
// виведення результату в консоль system.out.printin("Округлене число:" + roundedNumber);
        System.out.println("Округлене число: " + (double) roundedNumber);
    }
}

