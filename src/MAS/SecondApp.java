package MAS;

public class SecondApp {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        binarMassive();
        System.out.println();
        System.out.println();
        System.out.println("Задание №2");
        tripleMassive();
        System.out.println();
        System.out.println();
        System.out.println("Задание №3");
        multiplyOnSix();
        System.out.println();
        System.out.println();
        System.out.println("Задание №4");
        squareMassive();

    }
    // Задание № 1
    static void binarMassive() {int[] arr = new int[10];
        System.out.println("Заданный начальный массив: ");
        // Заполняем массив
        for (int i = 0; i < 10; i++) {
            // тут загуглил и самостоятельно изучил, т.к. хотелось автоматизировать поцесс заполнения
            arr[i] = (int) (Math.random() * 2);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив после замен: ");
        // Заменяем значения
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    // Задание № 2
    static void tripleMassive() {
        int[] arr = new int[8];
        int a = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = a;
            a = a + 3;
            System.out.print(arr[i] + " ");
        }
    }
    // Задание № 3
    static void multiplyOnSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    // Задание № 4
    static void squareMassive() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}