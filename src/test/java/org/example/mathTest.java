package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.example.math.Operations.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathTest {

    @ParameterizedTest
    @MethodSource(value = "multiplyTestArguments")
    public void multiplyTest(Integer expected, Integer a, Integer b){
        assertEquals(expected, multiply(a, b));
    }


    public static Stream<Arguments> multiplyTestArguments() {
        return Stream.of(
                Arguments.of(50, 10, 5),
                Arguments.of(5, 1, 5),
                Arguments.of(-50, -10, 5),
                Arguments.of(0, 0, 5),
                Arguments.of(0, 10, 0)
        );
    }
}
