package com.tdd.pratices._2ocp.solution;

import lombok.Data;

@Data
public abstract class Conta {
        private double saldo;
        abstract void debitar(double valor,String description);
}
