package Excs;

import java.util.Arrays;

public class Company {
    private String name;
    private Employee[] employees = new Employee[5];

    public Company(String name) {
        this.name = name;
    }

    public void setEmployee(Employee[] employees) {
        this.employees = employees;
    }

    public double getAverageAge() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getAge();//e bejme me .getAge me qellim qe te mari vetem moshen.
        }
        return (double) sum / employees.length;
    }


    public String toString() {
        return "Company name: " + name + "\n,Employees: " + Arrays.toString(employees)
                + "\n, their average age: " + getAverageAge();
    }
}
