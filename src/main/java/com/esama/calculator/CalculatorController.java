package com.esama.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
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
    ModelAndView execute(CalculatorInput input, RedirectAttributes ra) {

        CalculatorResult result = new CalculatorResult();

        result.setInput(input);

        if (input.getOperation().equals("+")){
            result.setResult(calculatorInterface.Sum(input.getInputA(), input.getInputB()));

        }else if (input.getOperation().equals("-")){
            result.setResult(calculatorInterface.Sub(input.getInputA(), input.getInputB()));

        }else if (input.getOperation().equals(("*"))){
            result.setResult(calculatorInterface.Multi(input.getInputA(), input.getInputB()));

        }else if (input.getOperation().equals("/")){
            result.setResult(calculatorInterface.Div(input.getInputA(), input.getInputB()));

        }else{
            result.setResult(calculatorInterface.Sum(input.getInputA(), input.getInputB()));
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("calculator/calculator-result");
        modelAndView.addObject("model", result);

        return modelAndView;
    }
}
