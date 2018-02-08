package com.esama.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator implements CalculatorInterface {

    @Override
    public long Sum(long a, long b) {
        return a + b;
    }

    @Override
    public long Sub(long a, long b) {
        return a - b;
    }

    @Override
    public long Multi(long a, long b) {
        return a * b;
    }

    @Override
    public long Div(long a, long b) {
        return a / b;
    }
}
