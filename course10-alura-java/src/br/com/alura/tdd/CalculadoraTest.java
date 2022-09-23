package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosPositivos() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(1, 7);

        Assertions.assertEquals(8, soma);

    }

}
