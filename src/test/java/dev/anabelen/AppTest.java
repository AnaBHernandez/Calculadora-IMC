package dev.anabelen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testCalcularIMC() {
        assertEquals(22.86, App.calcularIMC(70, 1.75), 0.01); // Test para peso 70 kg y estatura 1.75 m
        assertThrows(IllegalArgumentException.class, () -> App.calcularIMC(70, 0)); // Test para estatura 0 (debe lanzar excepción)
    }

    @Test
    void testInterpretarIMC() {
        assertEquals("Peso normal", App.interpretarIMC(22.86)); // Test para IMC 22.86
        assertEquals("Delgadez severa", App.interpretarIMC(15)); // Test para IMC 15
        assertEquals("Obesidad mórbida", App.interpretarIMC(40)); // Test para IMC 40
        assertEquals("Delgadez moderada", App.interpretarIMC(16.5)); // Test para IMC 16.5 (rango 16-17)
        assertEquals("Delgadez leve", App.interpretarIMC(18)); // Test para IMC 18 (rango 17-18.5)
        assertEquals("Sobrepeso", App.interpretarIMC(27)); // Test para IMC 27 (rango 25-30)
        assertEquals("Obesidad leve", App.interpretarIMC(32)); // Test para IMC 32 (rango 30-35)
        assertEquals("Obesidad moderada", App.interpretarIMC(37)); // Test para IMC 37 (rango 35-40)
    }
}
