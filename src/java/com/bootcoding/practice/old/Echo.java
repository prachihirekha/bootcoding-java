package com.bootcoding.practice.old;

import java.util.Scanner;
public class Echo {
public static void main(String[] args) {
String data;
Scanner in = new Scanner(System.in);
System.out.print("Type something: ");
data = in.nextLine();
System.out.println("You said: " + data);
System.out.print("Type something else: ");
data = in.nextLine();
System.out.println("You also said: " + data);
}
}
