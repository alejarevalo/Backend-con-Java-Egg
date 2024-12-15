package test;

import org.junit.jupiter.api.Test;

import src.App;

import org.junit.jupiter.api.Assertions;

public class AppTest {
    @Test
    void testNumeroAleatorio() {
        for (int i = 0; i < 100; i++) {
            Integer resultado = App.numeroAleatorio();
            Assertions.assertTrue(resultado >= 1 && resultado <= 355);
        }
    }
}
