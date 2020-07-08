package MAS;
import java.util.Random;
import java.util.Scanner;
public class ThirdApp {
    public static void main(String[] args) {
        int go;
        do {
            int guessedNumber = getRandomNumber();
            System.out.println(guessedNumber);
            System.out.println("Я загадал число от 0 до 9, у тебя есть 3 попытки, чтобы его угадать");
            System.out.println("-------------------------------------------------------------------");
            for (int i = 0; i < 3; i++) {
                int gamerNumber = getNumberFromGamer("Введите число в пределах от 0 до 9", 0, 9);
                if (gamerNumber == guessedNumber) {
                    System.out.println("Верно!");
                    break;
                } else if (2 - i == 0) {
                    System.out.println("Ты проиграл, у тебя закончились все попытки(");
                } else {
                    System.out.println("Не угадал! Давай попробуем еще раз!");
                    System.out.println("У тебя еще осталось " + (2 - i) + " попытки(а)");
                    System.out.println("----------------------------------------------");
                    System.out.println();
                }
            }
            go = repeat();
        } while (go == 1);
    }
    static int getRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // Генерация случайного числа
        return randomNumber;
    }
    static int getNumberFromGamer(String message, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
    private static int repeat() {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            x = sc.nextInt();
        } while (x > 1 || x < 0);
        return x;
    }
}


