package com.example.kitchenstories;

import com.Calculations.ECalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllTests{
    private ECalc expertCalculation;

    @BeforeEach
    public void setup(){
       expertCalculation = new ECalc();
    }
    @Test
    public void subTotal() throws NullPointerException{
        double result = expertCalculation.calculateTotal(5 , 100 , 0.5 , 500);
        assertEquals(1150.0 , result);
    }
}
