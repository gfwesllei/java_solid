package com.tdd.pratices._1srp.violation;

import com.tdd.pratices.enums.Role;
import com.tdd.pratices.exception.WageCalculateExcption;
import lombok.Data;

@Data
public class Employe {

    private String name;
    private String cpf;
    private Role role;
    double salary;


    public double calculateWage(){
        if (Role.DEVELOPEMENT.equals(getRole())){
            return salary + salary*0.3;
        }
        if (Role.PEOPLE_SUPORTE.equals(getRole())){
            return salary + salary*0.1;
        }
        throw  new WageCalculateExcption("Canot calcule wage");
    }

}
