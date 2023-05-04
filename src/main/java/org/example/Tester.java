package org.example;

public class Tester
{
    public String name;
    public  String surname;
    public  int expireanseInYear;
    public  String engLevel;
    public  double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getExpireanseInYear() {
        return expireanseInYear;
    }

    public String getEngLevel() {
        return engLevel;
    }

    public double getSalary() {
        return salary;
    }

    public Tester()
    {
    }

    public Tester(String name, int expireanseInYear)
    {
        this.name = name;
        this.expireanseInYear = expireanseInYear;
    }

    public Tester(String name, String surname, double salary, int expireanseInYear, String engLevel)
    {
        this(name, expireanseInYear);
        this.surname = surname;
        this.salary = salary;
        this.engLevel = engLevel;
    }


    public void TakeSalary()
    {
        System.out.println(this.salary);
    }
    public double takeSalary(double salary, int experienceInYears) //перегруз типа премия
    {
        return salary * experienceInYears / 2;
    }

    public void takeSalary(double salary, String engLevel) //перегруз типа исходя из ур англа надбавка
    {
        if (engLevel == "A1" || engLevel == "A2")
        {
        System.out.println(salary);
    }
        if (engLevel == "B1" || engLevel == "B2") {
        System.out.println(salary + 150);
    }
        if (engLevel == "C1" || engLevel == "C2") {
            System.out.println(salary + 550);
        }
    }

    public static int compareExperience(Tester tester1, Tester tester2)
    {
        return Integer.compare(tester1.expireanseInYear, tester2.expireanseInYear);
    }

    public String ToString()
    {
        return name;
    }
}
