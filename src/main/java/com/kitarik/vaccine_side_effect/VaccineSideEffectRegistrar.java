package com.kitarik.vaccine_side_effect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class VaccineSideEffectRegistrar {
    private List<String> list = new ArrayList<>();


    public void registerSideEffect(String chill) {
        list.add(chill);
    }

    public void printAll() {
        list.forEach(System.out::println);
    }

    public int count() {
        return list.size();
    }
}
