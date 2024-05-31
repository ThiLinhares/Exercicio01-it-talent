package org.example.it_talent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TesteCalculadora{

        Calculadora calculo = new Calculadora();

        @Test
        public void multiplicacao(){
                assertEquals(100, calculo.calc(10, 10));
        }
}

