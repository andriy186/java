public class main1{
    public static void main(String[] args) {
        int n = 358; // задане тризначне число
        int maxDigit = 0; // змінна для зберігання найбільшої цифри
        int currentDigit; // змінна для зберігання поточної цифри
        while (n > 0) {
            currentDigit = n % 10; // отримуємо поточну цифру
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit; // оновлюємо найбільшу цифру, якщо поточна більша
            }
            n /= 10; // переходимо до наступної цифри
        }
        System.out.println("Найбільша цифра в числі " + (n*100) + " - " + maxDigit); // виводимо результат
    }
}

