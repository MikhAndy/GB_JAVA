package MAS;

public class FirstApp {
    public static void main(String[] args) {
        byte by;
        by = 120;
        short sh;
        sh = 30000;
        int in;
        in = 21456765;
        long lo;
        lo = 8888888888888888888L;
        float fl;
        fl = 2.54f;
        double f;
        f = -123.123;
        char ch;
        ch = 'V';
        boolean boo;
        boo = true;

        System.out.println(thirdTask(2, 8, 6, 3));
        System.out.println(fourTask(8, 10));
        fiveTask(-684);
        System.out.println(sixTask(-95));
        sevenTask("Андрей");
    }

    static int thirdTask(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    static boolean fourTask(int e, int f) {
        boolean i = false;
        if (e + f <= 20 && e + f >= 10)
        {
            i = true;
        }
        return i;
    }

    static void fiveTask(int a)    {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean sixTask(int a) {
        boolean i = false;
        if (a < 0) {
            i = true;
        }
        return i;
    }

    static void sevenTask(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

