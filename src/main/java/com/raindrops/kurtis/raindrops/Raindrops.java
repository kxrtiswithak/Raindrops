package com.raindrops.kurtis.raindrops;

public class Raindrops {
    public static String raindrops(int num) {
        if (num % 3 == 0) {
            return "Pling";
        } else if (num % 5 == 0) {
            return "Plang";
        }
        return null;
    }
}
