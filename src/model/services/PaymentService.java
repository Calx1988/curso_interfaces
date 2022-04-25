package model.services;

public interface PaymentService {
    public Double paymentFee(double value);
    public Double interestRate(double value, int months);
}
