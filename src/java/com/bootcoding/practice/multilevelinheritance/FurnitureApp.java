package com.bootcoding.practice.multilevelinheritance;

public class FurnitureApp {
    public static void main(String[] args) {
        ComputerTable ct =new ComputerTable();
        System.out.println(ct.color="red");
        System.out.println(ct.dimension ="4.5px");
        System.out.println(ct.legs ="4");
        System.out.println(ct.material ="Metal");
        DinningTable dt =new DinningTable();
        System.out.println(dt.color="blue");
        System.out.println(dt.legs="6");
        System.out.println(dt.material="Wood");
        System.out.println(dt.price=7000);
        LTypeSofa lt =new LTypeSofa();
        System.out.println(lt.color="golden");
        System.out.println(lt.dimension ="2px");
        System.out.println(lt.price ="5000");
        RecLineSofa rl =new RecLineSofa();
        System.out.println(rl.color ="Black");
        System.out.println(rl.material ="SheemshamWood");
        System.out.println(rl.price ="3000");
    }
}
