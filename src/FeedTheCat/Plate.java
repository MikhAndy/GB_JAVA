package FeedTheCat;

import java.util.Scanner;

public class Plate
{
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void statusPlate()
    {
        System.out.println("food in a plate: " + food);
    }

    public void decreasePlate(int val)
    {
        this.food = this.food - val;
        if (this.food < 0)
        {
            this.food = 0;
        }
    }

    public int getInfoPlate()
    {
        return this.food;
    }

    public void addFood()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько добавить?");
        int val = sc.nextInt();
        this.food = this.food + val;
    }
}
