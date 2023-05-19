package com.keyin.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testMultiply(){
        Example exampleUnderTest = new Example();
        Assertions.assertEquals(10,exampleUnderTest.multiply(10,1));
        Assertions.assertNotEquals(10,exampleUnderTest.multiply(13,1));

    }

    @Test
    public void testFormat(){
        Example exampleUnderTest = new Example();

        String source = "Test string formatting method";
        String expectedResult = "Test,string,formatting,method";

        Assertions.assertEquals(expectedResult,exampleUnderTest.format(source));

    }


}
