package model.services;

public class PaypalPaymentService implements PaymentService{
    public static final Double PAYMENT_FEE = 0.02;
    public static final Double INTEREST_RATE = 0.01;
    @Override
    public Double paymentFee(double value){
        return value*PAYMENT_FEE;
    }
    @Override
    public Double interestRate(double value, int months){
        return (value*INTEREST_RATE) * months;
    }
}
