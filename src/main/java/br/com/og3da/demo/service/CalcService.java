package br.com.og3da.demo.service;

import br.com.og3da.demo.exceptions.UnsupportedMathOperation;

public class CalcService {

    public static Double sumValues(String value1, String value2) {
        try {
            var v1 = Double.parseDouble(value1);
            var v2 = Double.parseDouble(value2);

            return v1 + v2;
        } catch (Exception e) {
            throw new UnsupportedMathOperation(e.getMessage());
        }
    }

    public static Double subtractionValues(String value1, String value2) {
        try {
            var v1 = Double.parseDouble(value1);
            var v2 = Double.parseDouble(value2);

            return v1 - v2;
        } catch (Exception e) {
            throw new UnsupportedMathOperation(e.getMessage());
        }
    }

    public static Double multiplicationValues(String value1, String value2) {
        try {
            var v1 = Double.parseDouble(value1);
            var v2 = Double.parseDouble(value2);

            return v1 * v2;
        } catch (Exception e) {
            throw new UnsupportedMathOperation(e.getMessage());
        }
    }

    public static Double divisionValues(String value1, String value2) {
        try {
            var v1 = Double.parseDouble(value1);
            var v2 = Double.parseDouble(value2);

            return v1 / v2;
        } catch (Exception e) {
            throw new UnsupportedMathOperation(e.getMessage());
        }
    }
}
