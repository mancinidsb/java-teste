package com.github.mancinidsb.javateste.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.github.mancinidsb.javateste.models.Animal;

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
    
    @Test 
    void testeConstrutorAnimal(){
    	Animal gato = new Animal("Gatito", 15.6);//Nome: "+nome+"\nPeso: "+peso
    	assertEquals("Nome: "+gato.nome+"\n"+"Peso: "+gato.peso, gato.toString());
    }
}