/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guill
 */
public class contarTodosCaracteresTest {
    
    public contarTodosCaracteresTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of contarTodosCaracteres method, of class contarTodosCaracteres.
     */
    @Test
    public void testContarTodosCaracteres() {
        System.out.println("contarTodosCaracteres");
        String cadena = "hola";
        contarTodosCaracteres instance = new contarTodosCaracteres();
        int[] expResult = null;
        int[] result = instance.contarTodosCaracteres(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
