package MAS;
import com.sun.media.sound.SoftTuning;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;
public class FourthApp {
    static char[][] map;
    static int SIZE = 3;
    static int DOTS_TO_WIN = 3;

    static char DOT_EMPTY = '.';
    static char DOT_X = 'X';
    static char DOT_O = 'O';

    public static void main(String[] args) {
        int go;
        do {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил компьютер");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
            go = repeat();
        } while (go == 1);
    }

        static void initMap ()
        {
            map = new char[SIZE][SIZE];

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        static void printMap ()
        {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        static void humanTurn ()
        {
            Scanner scanner = new Scanner(System.in);

            int x, y;

            do {
                System.out.println("Введите координаты в формате X Y");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
            } while (!isCellValid(x, y));

            map[x][y] = DOT_X;
        }

        static boolean isCellValid ( int x, int y)
        {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                return false;
            }
            if (map[x][y] == DOT_EMPTY) {
                return true;
            }

            return false;
        }

        static void aiTurn ()
        {
            Random random = new Random();
            int x, y;
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер сходил в " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        static boolean checkWin ( char symb){
            for (int i = 0; i < SIZE; i++) {
                if ((map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) || (map[0][i] == symb && map[1][i] == symb && map[2][i] == symb))
                    return true; // проверка линий
                if ((map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) || (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb))
                    return true; // проверка диагоналей
            }
            return false;
        }

        static boolean isMapFull ()
        {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY)
                        return false;
                }
            }
            return true;
        }

        private static int repeat () {
            Scanner sc = new Scanner(System.in);
            int x;
            do {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                x = sc.nextInt();
            } while (x > 1 || x < 0);
            return x;
        }
}
