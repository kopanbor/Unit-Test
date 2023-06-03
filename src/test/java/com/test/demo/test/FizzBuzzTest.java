package com.test.demo.test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test

    public void fizzBuzzConverter1() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        Assertions.assertEquals("1", fizzBuzz.convert(1));

    }

}