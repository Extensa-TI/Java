package interfaces.exercicio;

public interface OneLinePaymentService {

    Double paymentFee(double amount);
    Double interest(double amount, Integer months);
}
