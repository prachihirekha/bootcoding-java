package com.bootcoding.practice.method;

public class FindTheAreaOfHexagon {
    public static void main(String[] args) {
        FindTheAreaOfHexagon h = new FindTheAreaOfHexagon();
        h.areaOfHexagon(6.0);
    }

    public void areaOfHexagon(double s) {
        double hexagon = (6 * Math.pow(s, 2) / (4 * Math.tan(Math.PI/6)));
        System.out.println(hexagon);

    }

}

