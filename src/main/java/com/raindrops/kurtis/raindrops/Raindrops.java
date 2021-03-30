package com.raindrops.kurtis.raindrops;

public class Raindrops {
    public static String raindrops(int num) {
        if (num % 15 == 0) {
            return "PlingPlang";
        } else if (num % 7 == 0) {
            return "Plong";
        }else if (num % 3 == 0) {
            return "Pling";
        } else if (num % 5 == 0) {
            return "Plang";
        }
        return null;
    }
}
