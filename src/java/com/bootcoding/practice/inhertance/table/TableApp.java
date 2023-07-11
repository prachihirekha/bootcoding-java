package com.bootcoding.practice.inhertance.table;

public class TableApp {
    public static void main(String[] args) {
            ComputerTable cpt =new ComputerTable();
                cpt.setColor("Black");
                cpt.setLegs(4);
            DiningTable dt =new DiningTable();
            dt.setColor("Brown");
            dt.setLegs(6);
            System.out.println("Computer table color :"+cpt.getColor());
        System.out.println(" Computer table legs : "+cpt.getLegs());
        System.out.println("Dining table legs"+dt.getLegs());
        System.out.println("Dining table color"+dt.getColor());
    }
}
