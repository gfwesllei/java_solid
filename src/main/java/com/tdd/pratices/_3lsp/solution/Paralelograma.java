package com.tdd.pratices._3lsp.solution;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Paralelograma {
    private double altura;
    private double largura;

    public Paralelograma(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double areaTotal(){
        return getAltura()*getLargura();
    }
}
