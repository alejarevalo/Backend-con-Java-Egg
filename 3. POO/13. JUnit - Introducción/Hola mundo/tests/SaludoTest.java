package tests;
import org.junit.jupiter.api.Test;

import src.Saludo;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class SaludoTest {
   
    private final PrintStream standarOut = System.out;
    private final ByteArrayOutputStream ouutputStreamCaptor = new ByteArrayOutputStream();
   
    @BeforeEach
    public void setUp() {
    System.setOut(new PrintStream(ouutputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
    System.setOut(standarOut);
    }
    
    @Test
    void testMain() {
        Saludo.main(new String[1]);
        String salida = ouutputStreamCaptor.toString();
        assertEquals("Hola Mundo\r\n", salida);
    }
}

