/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.test;

import ico.fes.is.Aritmetica;
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
public class CalculadoraTest {
    private Aritmetica objeto;
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objeto = new Aritmetica();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void hello() {
        assertEquals((2+2), 4);
    }
    
    @Test
    public void probarSuma(){
        objeto.setOperador(Aritmetica.SUMA);
        objeto.setOperandoUno(10);
        objeto.setOperandoDos(5);
        int esperado = 15;
        assertEquals(esperado, objeto.calcular());
    }
}
