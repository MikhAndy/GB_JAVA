package MAS;

public class Cat extends Animal
{
    Cat(int run, double jump, int swim)
    {
        super(run, jump, swim);
        if (run > 200 || run < 0)
        {
            System.out.println("run: false");
        }
        if (jump > 2 || jump < 0)
        {
            System.out.println("jump: false");
        }
        if (swim != 0)
        {
            System.out.println("swim: false");
        }
    }
}
