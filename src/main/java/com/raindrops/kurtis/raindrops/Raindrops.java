package com.raindrops.kurtis.raindrops;

public class Raindrops {
    public static String raindrops(int num) {
        if (num % 3 == 0) {
            return "Pling";
        } else if (num % 5 == 0) {
            return "Plang";
        } else if (num % 7 == 0) {
            return "Plong";
        }
        return null;
    }
}
