package org.example.map;

public class EmployeeMain {
    public static void main(String[] args) {
        StaffTable staffTable = new StaffTable();
        Employee person1 = new Employee("Кирилл", "26", "Middle java dev", "150000 руб");
        Employee person2 = new Employee("Виталий", "28", "Senior java automation QA", "2000 $");
        Employee person3 = new Employee("Александр", "31", "Junior functional tester", "50000 руб");
        Employee person4 = new Employee("Дементий", "35", "Dev-ops", "1500 $");
        staffTable.add(person1);
        staffTable.add(person2);
        staffTable.add(person3);
        staffTable.add(person4);
        System.out.println(staffTable.getByAge(30));
        System.out.println(staffTable.getSalaryDollars());
        System.out.println(staffTable.averageAge());
    }
}
