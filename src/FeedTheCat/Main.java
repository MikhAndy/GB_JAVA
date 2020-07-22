package FeedTheCat;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /** Создаем тарелку с едой */
        Plate plate = new Plate(10);

        Cat[] catArr = new Cat[3];
        for (int i = 0; i < catArr.length; i++)
        {
            /** Создаем котов */
            catArr[i] = createCat();
            catArr[i].showInfoCat();

            /** Говорим котам проверить миску, и, если достаточно корма, то поесть из неё */
            while (catArr[i].checkFood(plate) == false)
            {
                if (askQuestion(plate.getInfoPlate()) == true)
                {
                    plate.addFood();
                } else break;
            }
            if (catArr[i].checkFood(plate) == true)
            {
                catArr[i].eat(plate);
            }

            /** Выводим информацию об их сытости */
            catArr[i].showSatietyCat();
        }

        System.out.println();
        System.out.println("В тарелке осталось: " + plate.getInfoPlate() + " еды");
    }

    static Cat createCat()
    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int appetite = random.nextInt(10);
        boolean satiety = false;
        String name = sc.nextLine();

        Cat cat = new Cat(name, appetite, satiety);

        return cat;
    }

    static boolean askQuestion(int val)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("В тарелке осталось " + val + " еды. Этого мало, чтобы этот кот поел. Добавить еды?");
        System.out.println("1 - добавить / 2 - не добавлять");
        int answ = sc.nextInt();
        if (answ == 1)
        {
            return true;
        }
        else return false;
    }
}
