package com.esama.calculator;

import org.springframework.stereotype.Service;

public interface CalculatorInterface {

    long Sum(long a, long b);

    long Sub(long a, long b);

    long Multi(long a, long b);

    long Div(long a, long b);

}
