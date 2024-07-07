package org.example;

import org.junit.jupiter.api.Test;

import static org.example.math.Operations.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathTest {

    @Test
    public void multiplyTest(){
        assertEquals(50, multiply(10, 5));
    }

}
