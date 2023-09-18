package org.example.map;

public class Employee {
    String name;
    String age;
    String position;
    String salary;

    public Employee(String name, String age, String position, String salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{"
                + "name='" + name + '\''
                + ", age='" + age + '\''
                + ", position='" + position + '\''
                + ", salary='" + salary + '\''
                + '}';
    }
}
