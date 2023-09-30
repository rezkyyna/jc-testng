package com.juaracoding;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {

    @Test
    public  void testAdd(){
        Calculator calculator = new Calculator();
        int actual = calculator.add(10,5);
                //actual setelah execution dan expected=15
        Assert.assertEquals(actual, 15);
    }

    @Test
    public  void testsubtract() {
        Calculator calculator = new Calculator();
        int actual = calculator.subtract(10, 5);
        //actual setelah execution dan expected=15
        Assert.assertEquals(actual, 5);
    }
}
