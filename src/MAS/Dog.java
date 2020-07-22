package MAS;

public class Dog extends Animal
{
    Dog(int run, double jump, int swim)
    {
        super(run, jump, swim);
        if (run > 500 || run < 0)
        {
            System.out.println("run: false");
        }
        if (jump > 0.5 || jump < 0)
        {
            System.out.println("jump: false");
        }
        if (swim > 10 || swim < 0)
        {
            System.out.println("swim: false");
        }
    }
}
