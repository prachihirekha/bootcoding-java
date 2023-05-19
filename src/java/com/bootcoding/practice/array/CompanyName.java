package com.bootcoding.practice.array;

public class CompanyName {
    public static void main(String[] args) {
        String [] companyNames ={"Dell","Hp","Asus","Apple","Lenovo"};
        int size =companyNames.length;
        for(int i=0;i<size;i++){

            String s= companyNames[i];
            char ch =s.charAt(0);
            if(ch=='A'){
                System.out.println( "Laptop first later started With A is = " +s);
            }
            System.out.println("Laptop Company Name is =" + companyNames[i]);
        }
    }
}
