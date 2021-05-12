package com.tdd.pratices._3lsp.violation;

import static java.lang.System.*;

public class Main {

    public static double calculaArea(Retangulo retangulo){
        return retangulo.areaTotal();
    }

    public static void main(String[] args) {

        double areaTotal = calculaArea(new Quadrado(10.0,5.0));
        out.println("Area total: "+areaTotal);

    }
}
