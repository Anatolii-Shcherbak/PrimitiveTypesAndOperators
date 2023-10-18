import java.math.BigDecimal;
import java.math.RoundingMode;


public class Task5 {
    public static void main(String[] args) {
        double PriceWithoutVat = 9.99;
        double Vat = 1.23;
        double AddValue = 10000;
        double PriceWitVat;
        double valueWithVat;
        double valueWithoutVat;

        System.out.println("Price without VAT:" + PriceWithoutVat);

        PriceWitVat = PriceWithoutVat * Vat;
        System.out.println("Price with VAT:" + PriceWitVat);

        valueWithoutVat = PriceWithoutVat * AddValue;
        System.out.println("Value without VAT:" + valueWithoutVat);

        valueWithVat = PriceWitVat * AddValue;
        System.out.println("Value with VAT:" + valueWithVat);

        System.out.println("BigDecimalClass");

        BigDecimal BdPriceWithoutVat = new BigDecimal("9.99");
        System.out.println("Price without VAT:" + BdPriceWithoutVat);

        BigDecimal BdPriceWithVat = BdPriceWithoutVat.multiply(new BigDecimal("1.23"));
        BdPriceWithVat = BdPriceWithVat.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println("Price with VAT:" + BdPriceWithVat);

       BigDecimal BdValueWithVat = BdPriceWithVat.multiply(new BigDecimal(10000));

        System.out.println("Value with VAT:" + BdValueWithVat);

        BigDecimal BdValueWithoutVat = BdValueWithVat.divide(new BigDecimal("1.23"),RoundingMode.HALF_EVEN );
        System.out.println("Value without VAT:" + BdValueWithoutVat);

    }
}
