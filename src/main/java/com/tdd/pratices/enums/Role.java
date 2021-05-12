package com.tdd.pratices.enums;

import com.tdd.pratices.srp.solution.WageCalcule;
import com.tdd.pratices.srp.solution.WageCalcule10Percent;
import com.tdd.pratices.srp.solution.WageCalcule30Percent;

public enum Role {

    DEVELOPEMENT(new WageCalcule30Percent()),
    PEOPLE_SUPORTE(new WageCalcule10Percent());
    WageCalcule wageCalcule;
    Role(WageCalcule wageCalcule){
        this.wageCalcule = wageCalcule;
    }

    public double calcule(double salaryBase){
        return this.wageCalcule.calcule(salaryBase);
    }
}
