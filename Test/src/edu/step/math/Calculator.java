package edu.step.math;

class Calculator {
    public Calculator() {}

    public static double plus(double first, double second) {
        return first + second;
    }

    public static double plus(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double minus(double first, double second) {
        return first - second;
    }

    public static double minus(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum -= number;
        }
        return sum;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double multiply(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum *= number;
        }
        return sum;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    public static double divide(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum /= number;
        }
        return sum;
    }
}

