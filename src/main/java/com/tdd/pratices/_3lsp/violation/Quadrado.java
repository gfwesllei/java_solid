package com.tdd.pratices._3lsp.violation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Quadrado extends  Retangulo{

    public Quadrado(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double areaTotal() {
        return getAltura() * getAltura();
    }
}
