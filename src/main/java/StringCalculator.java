package main.java;

import java.math.BigDecimal;

public abstract class StringCalculator {

    public static String add(String string) {
        if(string.isEmpty()) return "0";
        String[] stringArray = string.split(",");

        BigDecimal valueToFormat = BigDecimal.ZERO;

        for (int i = 0; i < stringArray.length; i++){
            valueToFormat = valueToFormat.add(new BigDecimal(stringArray[i]));
        }

        return valueToFormat.toPlainString();
    }
}
