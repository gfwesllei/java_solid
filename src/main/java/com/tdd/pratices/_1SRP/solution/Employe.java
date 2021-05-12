package com.tdd.pratices._1SRP.solution;

import com.tdd.pratices.enums.Role;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Employe  implements Serializable {

    private String name;
    private String cpf;
    private Role role;
    private double salary;

    public double calculateWage(){
        return role.calcule(getSalary());
    }

}
