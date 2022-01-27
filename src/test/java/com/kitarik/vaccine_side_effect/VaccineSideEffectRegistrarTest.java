package com.kitarik.vaccine_side_effect;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Evgeny Borisov
 */
public class VaccineSideEffectRegistrarTest {

    private final PrintStream standardOut = System.out;
    private ByteArrayOutputStream consoleContainer;
    private VaccineSideEffectRegistrar registrar;

    @Before
    public void setUp() {
        consoleContainer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleContainer));
        registrar = new VaccineSideEffectRegistrar();
        registrar.registerSideEffect("chill");
        registrar.registerSideEffect("temperature");
        registrar.registerSideEffect("cough");
    }

    @Test
    public void testCount() {
        Assert.assertEquals(3, registrar.count());
        registrar.registerSideEffect("jopabolit");
        Assert.assertEquals(4, registrar.count());
    }

    @Test
    public void testPrintAll() {

        registrar.printAll();
        String output = consoleContainer.toString();
        Assert.assertTrue(output.contains("chill"));
        Assert.assertTrue(output.contains("temperature"));
        Assert.assertTrue(output.contains("cough"));
    }

    @Test
    public void testPrint13ElementWhenExists() {
        for (int i = 0; i < 9; i++) {
            registrar.registerSideEffect("a");
        }
        registrar.registerSideEffect("kit 13");
        registrar.print13Element();
        Assert.assertTrue(consoleContainer.toString().contains("kit 13"));

    }

    @Test
    public void testPrint13ElementWhenNoExists() {

        registrar.print13Element();
        Assert.assertFalse(consoleContainer.toString().contains("null"));

    }
}