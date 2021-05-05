package Lesson5;

import java.util.Arrays;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    String wage;
    int age;
    public Employee(String name, String position, String email, String phoneNumber, String wage, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.wage = wage;
        this.age = age;
    }
    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", wage='" + wage + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Владимир", "охранник", "security@mail.com", "22-33-22", "3.000", 41);
        employeesArray[1] = new Employee("Лариса", "бухгалтер", "accountant@mail.com", "22-33-31", "7.500", 37);
        employeesArray[2] = new Employee("Борис", "Java developer", "javaDeveloper@mail.com", "22-33-55", "8.000", 43);
        employeesArray[3] = new Employee("Светлана", "секретарь", "secretary@mail.com", "22-22-22", "3.500", 25);
        employeesArray[4] = new Employee("Сергей", "Гереальный директор", "general.manager@mail.com", "22-22-21", "12.000", 47);

        for (Employee str : employeesArray) {
            if (str.getAge() > 40)
                System.out.println(str);
        }
    }
}
