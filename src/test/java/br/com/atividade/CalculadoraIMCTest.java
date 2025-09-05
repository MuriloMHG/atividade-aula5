package br.com.atividade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraIMCTest {

    private static final double EPS = 1e-6;

    @Test
    void calculaIMC_valoresValidos() {
        double imc = CalculadoraIMC.calcularIMC(70.0, 1.75);
        assertEquals(22.857142, imc, 1e-5);
    }

    @Test
    void calculaIMC_entradasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> CalculadoraIMC.calcularIMC(0, 1.7));
        assertThrows(IllegalArgumentException.class, () -> CalculadoraIMC.calcularIMC(70, 0));
        assertThrows(IllegalArgumentException.class, () -> CalculadoraIMC.calcularIMC(-10, 1.7));
    }

    @Test
    void classificacao_faixasOMS() {
        assertEquals("Abaixo do peso", CalculadoraIMC.classificacao(18.49));

        assertEquals("Normal", CalculadoraIMC.classificacao(18.5));
        assertEquals("Normal", CalculadoraIMC.classificacao(24.99));

        assertEquals("Sobrepeso", CalculadoraIMC.classificacao(25.0));
        assertEquals("Sobrepeso", CalculadoraIMC.classificacao(29.99));

        assertEquals("Obesidade", CalculadoraIMC.classificacao(30.0));
        assertEquals("Obesidade", CalculadoraIMC.classificacao(35.5));
    }
}
