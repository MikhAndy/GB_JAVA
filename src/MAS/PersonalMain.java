package MAS;
import java.util.Scanner;

public class PersonalMain {
    public static Personal[] persArr = new Personal[5];
    public static void main(String[] args)
    {
        for (int i = 0; i < persArr.length; i++)
        {
            persArr[i] = new Personal();
            persArr[i].showPerson();
        }

        System.out.println();
        System.out.println("---------------------------- ДОПОЛНИТЕЛЬНОЕ ЗАДАНИЕ -----------------------------");
        System.out.println();

        for (int i = 0; i < persArr.length; i++)
        {
            persArr[i].showOlder40();
        }
    }
}
