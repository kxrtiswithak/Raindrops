package com.raindrops.kurtis.raindrops;

public class Raindrops {

    /**
     * Returns the appropriate string dependent
     * <p>on what the string is divisible by:
     * <ul>
     *     <li>{@code 'Pling'} for 3</li>
     *     <li>{@code 'Plang'} for 5</li>
     *     <li>{@code 'Plong'} for 7</li>
     * </ul>
     * <p>a combination is included or omitted where necessary
     * @param num number to assessed
     * @return a string adhering to the above criteria
     */
    public static String raindrops(int num) {
        if (num % 105 == 0) {
            return "PlingPlangPlong";
        } else if (num % 35 == 0) {
            return "PlangPlong";
        } else if (num % 21 == 0) {
            return "PlingPlong";
        } else if (num % 15 == 0) {
            return "PlingPlang";
        } else if (num % 7 == 0) {
            return "Plong";
        } else if (num % 5 == 0) {
            return "Plang";
        }else if (num % 3 == 0) {
            return "Pling";
        }
        return String.valueOf(num);
    }
}
