package edu.step.conversion;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToEUR(double amountInRON) {
        if (amountInRON < 0) {
            System.out.println("Suma introdusă trebuie să fie un număr pozitiv.");
            return -1;
        }
        return amountInRON / exchangeRate;
    }

    public double convertToRON(double amountInEUR) {
        if (amountInEUR < 0) {
            System.out.println("Suma introdusă trebuie să fie un număr pozitiv.");
            return -1;
        }
        return amountInEUR * exchangeRate;
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(19.8); 
        double amountInRON = 100;
        double amountInEUR = 50;
        double resultInEUR = converter.convertToEUR(amountInRON);
        System.out.println(amountInRON + " RON = " + resultInEUR + " EUR");
        double resultInRON = converter.convertToRON(amountInEUR);
        System.out.println(amountInEUR + " EUR = " + resultInRON + " RON");
        converter.setExchangeRate(20.0); 
    }
}
