package com.tdd.pratices._1SRP.solution;

public class WageCalcule30Percent implements WageCalcule{

    @Override
    public double calcule(double salary) {
        return salary + salary*0.3;
    }
}
