package com.tdd.pratices._3lsp.violation;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Retangulo {
   private double altura;
   private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double areaTotal(){
       return altura* largura;
   }
}
