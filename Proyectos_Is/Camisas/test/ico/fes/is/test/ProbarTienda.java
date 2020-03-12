/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.test;

import ico.fes.is.polo.Camisa;
import ico.fes.is.polo.Tienda;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario-13
 */
public class ProbarTienda {
    
    public ProbarTienda() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void pruebaUno(){
        Tienda t = new Tienda(new Camisa("Camisa manga corta",190,1),
                              new Camisa("Camisa casual manga larga",230,1),
                              new Camisa("Camisa formal manga larga",310,1));
        assertEquals(693.5f,t.calcularTotal(),0);
    }
    
    @Test
    public void pruebaDos(){
        Tienda t = new Tienda(new Camisa("Camisa manga corta",190,1),
                              new Camisa("Camisa casual manga larga",230,3),
                              new Camisa("Camisa formal manga larga",310,0));
        assertEquals(836.0f,t.calcularTotal(),0);
    }
    
    @Test
    public void pruebaTres(){
        Tienda t = new Tienda(new Camisa("Camisa manga corta",190,5),
                              new Camisa("Camisa casual manga larga",230,6),
                              new Camisa("Camisa formal manga larga",310,1));
        assertEquals(2428.8f,t.calcularTotal(),0);
    }
    
    @Test
    public void pruebaCuatro(){
        Tienda t = new Tienda(new Camisa("Camisa manga corta",190,0),
                              new Camisa("Camisa casual manga larga",230,0),
                              new Camisa("Camisa formal manga larga",310,1));
        assertEquals(310.0f,t.calcularTotal(),0);
    }
    
}
