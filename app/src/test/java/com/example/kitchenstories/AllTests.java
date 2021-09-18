package com.example.kitchenstories;


import com.Calculations.ECalc;
import com.Calculations.MCalc;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AllTests{
    private ECalc expertCalculation;
    private MCalc Calculatesummary;


    @BeforeEach
    public void setup(){
       expertCalculation = new ECalc();
       Calculatesummary = new MCalc();
    }
    @Test
    public void subTotal() throws NullPointerException{
        double result = expertCalculation.calculateTotal(5 , 100 , 0.5 , 500);
        assertEquals(1150.0 , result);
    }
    @Test
    public void subRecipeSummary() throws NullPointerException {
        double result = Calculatesummary.Calculatesummary(5, 2, 600.0);
        assertEquals(6000.0, result);
    }
}
