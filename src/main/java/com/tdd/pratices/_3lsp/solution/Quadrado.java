package com.tdd.pratices._3lsp.solution;

import com.tdd.pratices.excption.ParalelogramaExcption;
import lombok.Data;

@Data
public class Quadrado extends Paralelograma{

    public Quadrado(double altura, double largura) {
        super(altura, largura);
        if (altura!=largura) {
            throw new ParalelogramaExcption("Width and height must be like then");
        }
    }
}
