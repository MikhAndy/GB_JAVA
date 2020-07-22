package FeedTheCat;

public class Cat
{
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety)
    {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate)
    {
        plate.decreasePlate(appetite);
        this.satiety = true;
    }

    public boolean checkFood(Plate plate)
    {
        return appetite <= plate.getInfoPlate();
    }

    void showInfoCat()
    {
        System.out.println(this.name + " " + this.appetite + " " + this.satiety);
    }

    void showSatietyCat()
    {
        System.out.println("Удалось покушать = " + this.satiety);
    }
}
