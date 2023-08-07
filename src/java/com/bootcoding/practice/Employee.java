package com.bootcoding.practice;

public class Employee {
    private String name;
    private int age;
    private double basic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", basic=" + basic +
                '}';
    }
}
class MyEmployee{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setName("Raja");
        employee.setAge(22);
        employee.setBasic(10000);
        System.out.println(employee);
    }
}



