package com.esama.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {


    @Autowired
    private CalculatorInterface calculatorInterface;

    public CalculatorController(CalculatorInterface calculatorInterface) {
        this.calculatorInterface = calculatorInterface;
    }

    @GetMapping("/calculator")
    String index() {
        return "calculator/calculator-home";
    }

    @PostMapping("/calculator/execute")
    String execute(CalculatorInput input, RedirectAttributes ra) {

        CalculatorResult result = new CalculatorResult();

        result.setInput(input);
        result.setResult(calculatorInterface.Sum(input.getInputA(), input.getInputB()));

        return "calculator/calculator-home";
    }
}
