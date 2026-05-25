package gr.aueb.cf.java.ch13;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentsUtil {

    private PaymentsUtil() {}

    /**
     * Rounds up the designated value to a number of decimalPlaces
     * @param value             the value to be rounded
     * @param decimalPlaces     the number of decimal places to round to
     * @return                  the rounded value
     */
    public static BigDecimal round(BigDecimal value, int decimalPlaces){
        if (value == null) return BigDecimal.ZERO;
        return value.setScale(decimalPlaces, RoundingMode.HALF_UP);
    }

    /**
     * Calculates the difference between two BigDecimals
     * @param a                 the first BigDecimal
     * @param b                 the second BigDecimal
     * @param decimalPlaces     the number of decimal places to round to
     * @return                  the difference between a and b, rounded to the specified number of decimal places
     */
    public static BigDecimal diff(BigDecimal a, BigDecimal b, int decimalPlaces) {
        if (a == null || b == null) return BigDecimal.ZERO;
        return b.subtract(a).setScale(decimalPlaces, RoundingMode.HALF_UP);
    }

}
