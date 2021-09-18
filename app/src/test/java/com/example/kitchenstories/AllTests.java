package com.example.kitchenstories;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.Calculations.MCalc;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AllTests {

    private MCalc Calculatesummary;

    @BeforeEach
    public void setup() {
        Calculatesummary = new MCalc();
    }

    @Test
    public void subRecipeSummary() throws NullPointerException {
        double result = Calculatesummary.Calculatesummary(5, 2, 600.0);
        assertEquals(6000.0, result);
    }
}