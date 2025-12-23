package com.github.mancinidsb.javateste.unit;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SimpleTest {

    @Test
    void testeSomaSimples() {
        // Um teste bobo só para o JUnit rodar e o JaCoCo ver
        int resultado = 2 + 2;
        assertEquals(4, resultado);
    }
    
    @Test
    void testeSubimples() {
        // Um teste bobo só para o JUnit rodar e o JaCoCo ver
        int resultado = 2 - 2;
        assertEquals(0, resultado);
    }
}