package com.example.binarycalculatortesting;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CalculatorController {

    @RequestMapping("/calc")
    public String calculator(@Valid @ModelAttribute BinaryCalculator binaryCalculator, BindingResult bindingResult) {
        return bindingResult.hasErrors() ? "BinaryCalculator" : "BinaryCalculator";
    }
}
