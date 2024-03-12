import java.util.Scanner;

public class MultiplicationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Введіть перше число: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Введіть друге число: ");
            int num2 = scanner.nextInt();
            
            int result = num1 * num2;
            System.out.println("Результат множення: " + result);
            
            System.out.print("Введіть 1, щоб завершити, або будь-яке інше число, щоб продовжити: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.println("Програма завершує роботу.");
                break; // Вихід з циклу
            }
        }
        scanner.close();
    }
}
