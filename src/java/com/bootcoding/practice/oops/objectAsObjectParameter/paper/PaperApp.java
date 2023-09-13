package com.bootcoding.practice.oops.objectAsObjectParameter.paper;

public class PaperApp {
    public static void main(String[] args) {
        Paper ps =new Paper();
        ps.setColor("Black");
        ps.setPrice(100);
        ps.setType("A4 size");
        PaperService p =new PaperService();
        p.paper(ps);
    }
}
