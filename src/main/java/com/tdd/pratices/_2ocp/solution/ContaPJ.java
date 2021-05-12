package com.tdd.pratices._2ocp.solution;

public class ContaPJ extends Conta {

    @Override
    public void debitar(double valorDebitado, String description){
        this.setSaldo(this.getSaldo()-valorDebitado );
    }
}
