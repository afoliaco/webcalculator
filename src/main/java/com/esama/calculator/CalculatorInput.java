package com.esama.calculator;

import java.io.PushbackInputStream;

public class CalculatorInput {
    private long inputA;
    private long inputB;
    private String operation;

    public long getInputA() {
        return inputA;
    }

    public long getInputB() {
        return inputB;
    }

    public String getOperation() {
        return operation;
    }

    public void setInputA(long inputA) {
        this.inputA = inputA;
    }

    public void setInputB(long inputB) {
        this.inputB = inputB;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}
