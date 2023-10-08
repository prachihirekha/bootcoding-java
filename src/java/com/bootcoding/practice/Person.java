package com.bootcoding.practice;

public class Person {
    private String name;
    private int age;
    private long phones;

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

    public long getPhones() {
        return phones;
    }

    public void setPhones(long phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phones=" + phones +
                '}';
    }
}


    class MyPerson{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rama");
        person.setAge(23);
        person.setPhones(93426453);
        System.out.println(person);
    }
}
