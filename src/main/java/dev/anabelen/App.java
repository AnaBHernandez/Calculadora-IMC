package dev.anabelen;

import java.text.DecimalFormat;

public class App {

    public static double calcularIMC(double peso, double estatura) {
        if (estatura <= 0) {
            throw new IllegalArgumentException("La estatura debe ser mayor que cero.");
        }
        return peso / Math.pow(estatura, 2);
    }

    public static String interpretarIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc < 17) {
            return "Delgadez moderada";
        } else if (imc < 18.5) {
            return "Delgadez leve";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidad leve";
        } else if (imc < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }

    public static void main(String[] args) {
        double peso = 70; // Peso de ejemplo
        double estatura = 1.75; // Estatura de ejemplo

        double imc = calcularIMC(peso, estatura);
        String interpretacion = interpretarIMC(imc);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Tu índice de masa corporal (IMC) es: " + df.format(imc));
        System.out.println("Según la clasificación de la OMS, esto significa que tienes: " + interpretacion);

        if (imc < 18.5) {
            System.out.println("Es importante mantener un peso saludable. Si tienes dudas, consulta a un profesional de la salud.");
        }
    }
}
