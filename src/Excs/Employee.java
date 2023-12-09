package Excs;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;


    public Employee (int age, String lastName,String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
