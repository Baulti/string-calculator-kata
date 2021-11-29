package tests;

import org.junit.jupiter.api.Test;

import main.java.StringCalculator;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void shouldAddEmptyInput(){
        assertEquals(StringCalculator.add(""), "0");
    }

    @Test
    void shouldReturnUniqueArgument(){
        assertEquals(StringCalculator.add("1"), "1");
        assertEquals(StringCalculator.add("23.45"), "23.45");
    }

    @Test
    void shouldAdd2Inputs(){
        assertEquals(StringCalculator.add("1,1"), "2");
        assertEquals(StringCalculator.add("2.2,1.3"), "3.5");
    }

    @Test
    void shouldAddInputs(){
        assertEquals(StringCalculator.add("2.2,1.3,4.4,5.5,5.5"), "18.9");

        int random = (int)(Math.random() * ((50 - 2) + 1)) + 2;
        String number = "3.1437632467";
        String value = "";
        BigDecimal res = new BigDecimal(number).multiply(BigDecimal.valueOf(random));

        for (int i = 1; i < random; i++){
            value += number + ",";
        }
        value += number;

        assertEquals(StringCalculator.add(value), res.toPlainString());
    }

}