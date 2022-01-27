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

}