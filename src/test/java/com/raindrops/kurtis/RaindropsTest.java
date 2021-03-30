package com.raindrops.kurtis;

import com.raindrops.kurtis.raindrops.Raindrops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Raindrops app
 */
public class RaindropsTest {

    /**
     * <em>Tests</em> that {@code 'Pling'} is returned when
     * <p>{@code num} is divisible by 3 alone
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'Pling'")
    @CsvSource({"3", "6", "9", "12", "18", "27"})
    void shouldReturnPling(int num) {
        assertEquals(Raindrops.raindrops(num), "Pling");
    }

    /**
     * <em>Tests</em> that {@code 'Plang'} is returned when
     * <p>{@code num} is divisible by 5 alone
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'Plang'")
    @CsvSource({"5", "10", "20", "25", "40", "50"})
    void shouldReturnPlang(int num) {
        assertEquals(Raindrops.raindrops(num), "Plang");
    }

    /**
     * <em>Tests</em> that {@code 'Plong'} is returned when
     * <p>{@code num} is divisible by 7 alone
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'Plong'")
    @CsvSource({"7", "14", "28", "49", "56", "77"})
    void shouldReturnPlong(int num) {
        assertEquals(Raindrops.raindrops(num), "Plong");
    }

    /**
     * <em>Tests</em> that {@code 'PlingPlang'} is returned when
     * <p>{@code num} is divisible by both 3 and 5
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'PlingPlang'")
    @CsvSource({"15", "30", "45", "60", "75", "90"})
    void shouldReturnPlingPlang(int num){
        assertEquals(Raindrops.raindrops(num), "PlingPlang");
    }

    /**
     * <em>Tests</em> that {@code 'PlingPlong'} is returned when
     * <p>{@code num} is divisible by both 3 and 7
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'PlingPlong'")
    @CsvSource({"21", "42", "63", "84", "126", "147"})
    void shouldReturnPlingPlong(int num){
        assertEquals(Raindrops.raindrops(num), "PlingPlong");
    }

    /**
     * <em>Tests</em> that {@code 'PlangPlong'} is returned when
     * <p>{@code num} is divisible by both 5 and 7
     * @param num the number to be tested
     */
    void shouldReturnPlangPlong(int num){}

    /**
     * <em>Tests</em> that {@code 'PlingPlangPlong'} is returned when
     * <p>{@code num} is divisible by 3, 5 and 7
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'PlingPlangPlong'")
    @CsvSource({"105", "210", "315", "420", "525", "630"})
    void shouldReturnPlingPlangPlong(int num){
        assertEquals(Raindrops.raindrops(num), "PlingPlangPlong");
    }

    /**
     * <em>Tests</em> that {@code num}'s digits are returned when
     * <p>{@code num} is divisible by neither 3, 5 or 7
     * @param num the number to be tested
     */
    void shouldReturnDigits(int num){}


}
