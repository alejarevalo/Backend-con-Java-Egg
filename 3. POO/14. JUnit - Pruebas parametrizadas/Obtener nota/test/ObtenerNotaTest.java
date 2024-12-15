package test;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import src.ObtenerNota;


public class ObtenerNotaTest {
    private InputStream standarIn = System.in;

    @ParameterizedTest
    @CsvSource({"'100\n', A", "'90\n', A", "'80\n', B"})
    // @CsvSource({"'100\n', A", "'90\n', A", "'80\n', B", "70, C", "60, D", "50, F"})
    void testObtenerNota(String calificacion, String notaEsperada) {
       String esperado = ObtenerNota.obtenerNota(Integer.parseInt(calificacion));
       Assertions.assertEquals(notaEsperada, esperado);
    }    

    @AfterEach
    public void tearDown() {
        System.setIn(standarIn); //le explicamos qye vamos a dar un input a traves de la consola
    }
}
