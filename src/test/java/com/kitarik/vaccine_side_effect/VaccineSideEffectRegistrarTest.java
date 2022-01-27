package com.kitarik.vaccine_side_effect;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class VaccineSideEffectRegistrarTest {


    @Test
    public void testCountLogic() {
        VaccineSideEffectRegistrar registrar = new VaccineSideEffectRegistrar();
        registrar.registerSideEffect("chill");
        registrar.registerSideEffect("temperature");
        registrar.registerSideEffect("cough");
        registrar.printAll();


        Assert.assertEquals(3, registrar.count());

        registrar.registerSideEffect("jopabolit");
        Assert.assertEquals(4,registrar.count());

        System.out.println("URA!!!!");

    }

}