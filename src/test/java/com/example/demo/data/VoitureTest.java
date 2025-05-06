package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){

         // Test du constructeur par défaut
    @Test
    void testConstructorDefault() {
        assertNotNull(voiture, "La voiture ne doit pas être null");
        assertEquals(0, voiture.getId(), "L'ID de la voiture doit être 0 par défaut");
        assertNull(voiture.getMarque(), "La marque de la voiture doit être null par défaut");
        assertEquals(0, voiture.getPrix(), "Le prix de la voiture doit être 0 par défaut");
    }

    // Test du constructeur avec paramètres
    @Test
    void testConstructorWithParameters() {
        Voiture voitureTest = new Voiture("Toyota", 20000);
        assertEquals("Toyota", voitureTest.getMarque(), "La marque doit être Toyota");
        assertEquals(20000, voitureTest.getPrix(), "Le prix doit être 20000");
    }

    // Test du setter et getter pour la marque
    @Test
    void testSetAndGetMarque() {
        voiture.setMarque("Renault");
        assertEquals("Renault", voiture.getMarque(), "La marque de la voiture doit être Renault");
    }

    // Test du setter et getter pour le prix
    @Test
    void testSetAndGetPrix() {
        voiture.setPrix(15000);
        assertEquals(15000, voiture.getPrix(), "Le prix de la voiture doit être 15000");
    }

    // Test du setter et getter pour l'ID
    @Test
    void testSetAndGetId() {
        voiture.setId(123);
        assertEquals(123, voiture.getId(), "L'ID de la voiture doit être 123");
    }

    // Test de la méthode toString()
    @Test
    void testToString() {
        voiture.setMarque("BMW");
        voiture.setPrix(30000);
        voiture.setId(1);
        
        String expectedString = "Car{marque='BMW', prix=30000, id=1}";
        assertEquals(expectedString, voiture.toString(), "La méthode toString() doit retourner la chaîne attendue");
    }
}

    }


