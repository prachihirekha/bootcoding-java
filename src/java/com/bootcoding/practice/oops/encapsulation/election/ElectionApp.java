package com.bootcoding.practice.oops.encapsulation.election;

import java.util.concurrent.Callable;

public class ElectionApp {
    public static void main(String[] args) {
        Candidate candidate =new Candidate();
        candidate.setName("Rajesh");
        candidate.setAddress("Nagpur");
        candidate.setEducation("Bsc Cs");
        candidate.setAge(28);
        System.out.println(candidate.getName());
        System.out.println(candidate.getAddress());
        System.out.println(candidate.getEducation());
        System.out.println(candidate.getAge());



    }
}
