import java.util.Scanner;

public class Main {
    public static void main(String...args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Привет! Я Веселый Градусник! А как тебя зовут: ");

    String userName = scanner.nextLine();

    System.out.println("Привет, " + userName);
    System.out.println("Знаешь почему меня называют Веселый Градусник? Потому что я люблю переводить градусы Цельсия в Фаренгейт. Давай покажу!?");
    System.out.println("Введи любое целое число от -100 до 100 (например, -10, 2, 77) и посмотрим что получится: ");

    double number = scanner.nextInt();
    double result = number * 1.8 + 30;
    System.out.println("По Фаренгейту это будет " + result + " градусов");


    }
}