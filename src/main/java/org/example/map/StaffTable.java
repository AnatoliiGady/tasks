package org.example.map;


import java.util.ArrayList;
import java.util.List;

public class StaffTable {
    List<Employee> employees = new ArrayList<>();

    public void add(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getByAge(int age) {
        List<Employee> rsl = new ArrayList<>();
        for (Employee e : employees) {
            String ageStr = e.getAge();
            int ageEmployee = Integer.parseInt(ageStr);
            if (ageEmployee < age) {
                rsl.add(e);
            }
        }
        return rsl;
    }

    public List<Employee> getSalaryDollars() {
        List<Employee> rsl = new ArrayList<>();
        for (Employee e : employees) {
            String salaryStr = e.getSalary();
            String[] a = salaryStr.split(" ");
            for (String str : a) {
                if (str.equals("$")) {
                    rsl.add(e);
                }
            }
        }
        return rsl;
    }

    public int averageAge() {
        int count = 0;
        int averageAge = 0;
        for (Employee e : employees) {
            averageAge += Integer.parseInt(e.getAge());
            count++;
        }
        return averageAge / count;
    }
}

