package com.edu.appIfpa.Calculator.service;


public class OperadorService {
    public double selecionaOperador(String operator, double num1, double num2) {
            var result = 0.0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            return result;
    }

}
