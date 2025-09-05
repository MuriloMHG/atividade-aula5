package br.com.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {
    private static final double EPS = 1e-6;

    @Test
    void celsiusParaFahrenheit_normal() {
        assertEquals(98.6, ConversorTemperatura.celsiusParaFahrenheit(37.0), 0.1);
        assertEquals(50.0, ConversorTemperatura.celsiusParaFahrenheit(10.0), EPS);
    }

    @Test
    void celsiusParaFahrenheit_bordas() {
        // Ponto de congelamento da água
        assertEquals(32.0, ConversorTemperatura.celsiusParaFahrenheit(0.0), EPS);
        // Ponto de ebulição da água
        assertEquals(212.0, ConversorTemperatura.celsiusParaFahrenheit(100.0), EPS);
        // Negativo
        assertEquals(14.0, ConversorTemperatura.celsiusParaFahrenheit(-10.0), EPS);
    }

    @Test
    void fahrenheitParaCelsius_normal() {
        assertEquals(37.0, ConversorTemperatura.fahrenheitParaCelsius(98.6), 0.1);
        assertEquals(10.0, ConversorTemperatura.fahrenheitParaCelsius(50.0), EPS);
    }

    @Test
    void fahrenheitParaCelsius_bordas() {
        assertEquals(0.0, ConversorTemperatura.fahrenheitParaCelsius(32.0), EPS);
        assertEquals(100.0, ConversorTemperatura.fahrenheitParaCelsius(212.0), EPS);
        assertEquals(-10.0, ConversorTemperatura.fahrenheitParaCelsius(14.0), EPS);
    }
}
