package com.example.binarycalculatortesting;

import org.springframework.stereotype.Service;

import javax.validation.constraints.Pattern;

@Service
public class BinaryCalculator {

    @Pattern(regexp = "^[01]{4}$",
            message = "Please use a 4-digit binary number.")
    private String binary = "0000";

    public int getDecimal() {
        return this.getBinary().matches("^[01]{4}$")?
                Integer.parseInt( this.getBinary(), 2):
                0;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public String getBinary(){
        return this.binary;
    }
}
