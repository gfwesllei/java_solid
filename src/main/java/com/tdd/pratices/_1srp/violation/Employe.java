package com.tdd.pratices._1srp.violation;

import com.tdd.pratices.enums.Role;
import com.tdd.pratices.excption.WageCalculateExcption;
import lombok.Data;

@Data
public class Employe {

    private String name;
    private String cpf;
    private Role role;

    public double calculateWage(){
        double baseWage=4000;
        if (Role.DEVELOPEMENT.equals(getRole())){
            return baseWage + baseWage*0.3;
        }
        if (Role.PEOPLE_SUPORTE.equals(getRole())){
            return baseWage + baseWage*0.1;
        }
        throw  new WageCalculateExcption("Canot calcule wage");
    }

}
