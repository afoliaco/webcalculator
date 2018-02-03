package com.esama.calculator;

public class CalculatorResult {

    private long result;
    private CalculatorInput input;

    public CalculatorInput getInput() {
        return input;
    }

    public long getResult() {
        return result;
    }

    public void setInput(CalculatorInput input) {
        this.input = input;
    }

    public void setResult(long result) {
        this.result = result;
    }
}
