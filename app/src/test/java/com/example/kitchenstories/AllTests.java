package com.example.kitchenstories;

import  com.Calculations.RevCalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AllTests {
    private RevCalc reviewCalculation;

    @BeforeEach
    public void setUp(){
        reviewCalculation = new RevCalc();
    }

    @Test
   public void subReviewTotal() throws NullPointerException{
        double result =  reviewCalculation.calculateTotalReview(2,200,0.7);
        assertEquals(280.0, result);
    }
}