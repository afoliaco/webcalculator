package com.esama.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CalculatorController {

    @GetMapping("/calculator")
    String index() {
        return "calculator/calculator-home";
    }

    @PostMapping("/calculator/execute")
    String execute(CalculatorInput input, RedirectAttributes ra) {

        CalculatorResult result = new CalculatorResult();

        result.setInput(input);
        result.setResult(0);

        return "calculator/calculator-home";
    }
}
