package com.kitarik.school;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Evgeny Borisov
 */
public class GradeCalculatorTest {

    @Test
    public void testTotalAndAvg() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.addMark(96);
        gradeCalculator.addMark(90);
        gradeCalculator.addMark(90);
        int avg = gradeCalculator.average();
        int sum = gradeCalculator.sum();
        Assert.assertEquals(276,sum);
        Assert.assertEquals(92,avg);
    }

    @Test
    public void testMarkCount() {
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.addMark(100);
        gradeCalculator.addMark(90);
        gradeCalculator.addMark(90);
        int amount = gradeCalculator.totalGrades();
        Assert.assertEquals(3,amount);
    }
}