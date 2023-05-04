package org.example;

public class Main {
    public static void main(String[] args)
    {
        Tester one = new Tester();
        one.name = "Alex";
        one.surname = "light";
        one.expireanseInYear = 4;
        one.engLevel = "C1";
        one.salary = 456.5;

        one.takeSalary(one.salary, one.engLevel);

        System.out.println(one.takeSalary(one.salary, one.expireanseInYear));

        Tester two = new Tester("Jake", "Lightwood;",  786.9, 6, "A2");

        int expComp = Tester.compareExperience(one, two);
        if (expComp > 0)
        {
            System.out.println(one.getName() + " больше опыта работы, чем у " + two.getName());
        }
        else if (expComp < 0)
        {
            System.out.println(two.getName() + " больше опыта работы, чем у " + one.getName());
        }
        else
        {
            System.out.println(one.getName() + " and " + two.getName() + " равны по опыту работы!");
        }
   }
}