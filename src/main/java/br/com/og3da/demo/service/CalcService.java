package br.com.og3da.demo.service;

import br.com.og3da.demo.exceptions.UnsupportedMathOperation;

public class CalcService {

    public static Double sumValues(String value1, String value2) {
        return convertToDouble(value1) + convertToDouble(value2);
    }

    public static Double subtractionValues(String value1, String value2) {
        return convertToDouble(value1) - convertToDouble(value2);
    }

    public static Double multiplicationValues(String value1, String value2) {
        return convertToDouble(value1) * convertToDouble(value2);
    }

    public static Double divisionValues(String value1, String value2) {
        return convertToDouble(value1) / convertToDouble(value2);
    }

    private static Double convertToDouble(String value) {
        if (isNumericRegex(value))
            return Double.parseDouble(value);

        throw new UnsupportedMathOperation("VALOR NÃO NUMÉRICO");
    }

    private static boolean isNumericRegex(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

}
