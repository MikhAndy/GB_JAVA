package MAS;
import java.util.Scanner;

        /** Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
        Конструктор класса должен заполнять эти поля при создании объекта;
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
        Создать массив из 5 сотрудников
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);

        С помощью цикла вывести информацию только о сотрудниках старше 40 лет; **/
public class Personal {
    Scanner sc = new Scanner(System.in);
    String surname, name, fathersName, function, email, phone;
    int salary, age;

    Personal()
    {
        this.surname = getSurname();
        this.name = getName();
        this.fathersName = getFathersName();
        this.function = getFunction();
        this.email = getEmail();
        this.phone = getPhone();
        this.salary = getSalary();
        this.age = getAge();
    }

    String getSurname()
    {
        System.out.println("Введите фамилию");
        surname = sc.nextLine();
        return surname;
    }

    String getName()
    {
        System.out.println("Введите имя");
        name = sc.nextLine();
        return name;
    }

    String getFathersName()
    {
        System.out.println("Введите отчество");
        fathersName = sc.nextLine();
        return fathersName;
    }

    String getFunction()
    {
        System.out.println("Введите должность");
        function = sc.nextLine();
        return function;
    }

    String getEmail()
    {
        System.out.println("Введите e-mail");
        email = sc.nextLine();
        return email;
    }

    String getPhone()
    {
        System.out.println("Введите телефон");
        phone = sc.nextLine();
        return phone;
    }

    int getSalary()
    {
        System.out.println("Введите заработную плату");
        salary = sc.nextInt();
        return salary;
    }

    int getAge()
    {
        System.out.println("Введите возраст");
        age = sc.nextInt();
        return age;
    }

    void showPerson()
    {
        System.out.println(this.surname + " " + this.name + " " + this.fathersName + " " + this.function + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
    }

    void showOlder40()
    {
        if (this.age > 40)
        {
            System.out.println(this.surname + " " + this.name + " " + this.fathersName + " " + this.function + " " + this.email + " " + this.phone + " " + this.salary + " " + this.age);
        }
    }
}
