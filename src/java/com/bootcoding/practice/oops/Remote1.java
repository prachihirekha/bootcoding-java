package com.bootcoding.practice.oops;

public class Remote1 {
   int totalButton ;
   double price;
   String color;
      public   void  print(){
          System.out.println(totalButton);
          System.out.println(price);
          System.out.println(color);
      }

    public static void main(String[] args) {
        Remote1 remote =new Remote1();
        remote.totalButton = 30;
        remote.color ="White";
        remote.price =150.33;
        Remote1 r =new Remote1();
        r.totalButton = 14;
        r.color ="yellow";
        r.price =100.33;
        Remote1 r2 =new Remote1();
        r2.totalButton =20;
        r2.color ="red";
        r2.price =150.33;
        Remote1 r3 =new Remote1();
        r3.totalButton = 30;
        r3.color ="black";
        r3.price =123.33;
        Remote1 r4 =new Remote1();
        r4.totalButton = 10;
       r4.color ="blue";
        r4.price =149.33;
        System.out.println("First Remote : ");
        remote.print();
        System.out.println("Second Remote : ");
        r2.print();
        System.out.println("Third Remote : ");
        r3.print();
        System.out.println("Forth Remote : ");
        r4.print();
        System.out.println("Fifth Remote : ");
        r.print();

    }


}
