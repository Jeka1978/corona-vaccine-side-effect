package com.kitarik.vaccine_side_effect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
public class VaccineSideEffectRegistrar {
    private List<String> list = new ArrayList<>();

    public VaccineSideEffectRegistrar() {
        for (int i = 0; i < 10; i++) {
            list.add(null);
        }
    }

    public void registerSideEffect(String chill) {
        list.add(chill);
    }

    public void printAll() {
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
    }

    public int count() {
        return list.size();
    }

    public void print13Element() {
    }
}
