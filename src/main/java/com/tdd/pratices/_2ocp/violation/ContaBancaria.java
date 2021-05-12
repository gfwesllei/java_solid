package com.tdd.pratices._2ocp.violation;

import com.tdd.pratices.enums.TipoConta;
import lombok.Data;

@Data
public class ContaBancaria {

    private String description;
    private double saldo;

    public void debitar(double valor,TipoConta tipoConta){
        if(TipoConta.PF.equals(tipoConta)){
            saldo-=valor;
        }
        if(TipoConta.PJ.equals(tipoConta)){
            saldo-=valor;
        }
    }
}
