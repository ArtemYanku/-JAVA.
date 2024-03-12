import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть позитивне число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введено неправильне число. Будь ласка, введіть позитивне число.");
            return; // Вихід з програми
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Сума чисел від 1 до " + number + " дорівнює " + sum);
    }
}
