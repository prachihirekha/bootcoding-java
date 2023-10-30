package com.bootcoding.practice.oops;

public class Student {
    String name;
    int age;
    String lastName;
    int standard;
        public void details(){
            System.out.println(this.age);
            System.out.println(this.lastName);
            System.out.println(this.name);
            System.out.println(this.standard);

        }
          //default constructor
        Student(){
            System.out.println("construcor calleddddddd");
        }
        // paramiter pass
//



    // copy constructor
    Student(Student s2){
            this.lastName=s2.lastName;
            this.standard =s2.standard;
    }

}
