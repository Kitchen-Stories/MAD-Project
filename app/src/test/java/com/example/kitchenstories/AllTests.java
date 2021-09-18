package com.example.kitchenstories;

import com.Calculations.PCalc;

//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AllTests {
    private PCalc CalculatePaytotal;

    @BeforeEach
    public void setup() {
        CalculatePaytotal = new PCalc();
    }

    @Test
    public void TotalPayment() throws NullPointerException {
        double answer = CalculatePaytotal.CalculatePaytotal(250, 2);
        assertEquals(500, answer);

        //@Test
        //public void addition_isCorrect() {
        // assertEquals(4, 2 + 2);}
    }
}


