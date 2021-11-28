import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число");
        int numberTwo = scanner.nextInt();
        int max = (numberOne > numberTwo) ? numberOne:numberTwo;
        System.out.println("Наибольшее число - " + max);
        }
    }