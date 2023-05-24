package com.bootcoding.practice.oops;
// Remote - expensive affordable cheaper
public class ObjectAsParameter {
    public static void main(String[] args) {
        Remote r = new Remote("Videocon", "Gray", 55.00);

        ObjectAsParameter.isRemoteBlack(r);
        ObjectAsParameter.quality(r);
    }

    //static - class
    public static String quality(Remote r) {
        if (r.price >= 120) {
            return "Expensive";
        } else if (r.price >= 100) {
            return "Affordable";
        }
        return "cheaper";
    }


    public static boolean isRemoteBlack(Remote remote) {
        if (remote.color.equals("Black")) {
            return true;
        }
        return false;
    }
}







