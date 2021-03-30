package com.raindrops.kurtis;

import com.raindrops.kurtis.raindrops.Raindrops;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit tests for Raindrops app
 */
public class RaindropsTest {

    /**
     * <em>Tests</em> that {@code 'Pling'} is returned when
     * <p>{@code num} is divisible 3 alone
     * @param num the number to be tested
     */
    @ParameterizedTest(name = "testing with {0}")
    @DisplayName("should return 'Pling'")
    @CsvSource({"3", "6", "9", "12", "18", "27"})
    void shouldReturnPling(int num) {
        Assertions.assertEquals(Raindrops.raindrops(num), "Pling");
    }
}
