package edu.exercicios.calculadora;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números quebrados usando a
 * biblioteca math
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Waldemar Silva
 * @version 1.0
 * @since 24/08/2023
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public float somar(float numeroUm, float numeroDois) {
        return numeroUm + numeroDois;
    }

    public float subtração(float numeroUm, float numeroDois) {
        return numeroUm - numeroDois;
    }

    public float division(float numeroUm, float numeroDois) {
        return (float) (numeroUm / numeroDois);
    }

    public float multiplicação(float numeroUm, float numeroDois) {
        return numeroUm * numeroDois;
    }

    public float potencia(float numeroUm, float numeroDois) {
        return (float) (Math.pow(numeroUm, numeroDois));
    }

    public float raizQuadrada(float numeroUm) {
        return (float) (Math.sqrt(numeroUm));
    }

    public float modulo(float numeroUm, float numeroDois) {
        return (float) (numeroUm % numeroDois);
    }

    public float raizCúbica(float numeroUm) {
        return (float) (Math.cbrt(numeroUm));
    }

    public float logaritmoNatural(float numeroUm) {
        return (float) (Math.log(numeroUm));
    }

    public float logaritmoInverso(float numeroUm) {
        return (float) (Math.log10(numeroUm));
    }

    public float coseno(float numeroUm) {
        return (float) (Math.cos(numeroUm));
    }

    public float seno(float numeroUm) {
        return (float) (Math.sin(numeroUm));
    }

    public float tangente(float numeroUm) {
        return (float) (Math.tan(numeroUm));
    }

    public float cotangente(float numeroUm) {
        return (float) (1 / Math.tan(numeroUm));
    }

    public float arcoCoseno(float numeroUm) {
        return (float) (Math.acos(numeroUm));
    }

    public float arcoSeno(float numeroUm) {
        return (float) (Math.asin(numeroUm));
    }

    public float arcoTangente(float numeroUm) {
        return (float) (Math.atan(numeroUm));
    }

    public float arcoCotangente(float numeroUm) {
        return (float) (1 / Math.tan(numeroUm));
    }

}
