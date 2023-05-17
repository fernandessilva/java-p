package util;

public class CurrencyConverter {
    public static double Tax = 0.06;


    public static double priceToPay(double dollars, double dollarPrice){
        return dollars * dollarPrice * (1.0 + Tax);
    }

}
