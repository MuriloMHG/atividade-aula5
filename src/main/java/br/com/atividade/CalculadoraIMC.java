package br.com.atividade;

public class CalculadoraIMC {
    /** Retorna o IMC = peso(kg) / altura(m)^2 */
    public static double calcularIMC(double pesoKg, double alturaM) {
        if (pesoKg <= 0 || alturaM <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser positivos.");
        }
        return pesoKg / (alturaM * alturaM);
    }

    /** Classificação baseada em faixas (OMS) */
    public static String classificacao(double imc) {
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 25.0) return "Normal";
        if (imc < 30.0) return "Sobrepeso";
        return "Obesidade";
    }
}