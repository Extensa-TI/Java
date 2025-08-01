package interfaces.default_method;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    default public double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greate than zero");
        }
        return amount * Math.pow(1.0 + getInterestRate()/100.0, months);
    }

}
