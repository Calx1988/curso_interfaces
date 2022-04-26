package model.services;

import model.entities.Contract;
import model.entities.Installment;
import util.Miscellaneous;
import java.util.Date;


public class ContractService {
    private PaymentService paymentService;

    public ContractService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){
        double basicInstallment = contract.getValue()/months;
        for (int i = 0; i < months; i++) {
            double updatedInstallment = basicInstallment + paymentService.paymentFee(basicInstallment);
            double totalInstallment = updatedInstallment + paymentService.interestRate(updatedInstallment,(i+1));
            Date date = Miscellaneous.addMonth(contract.getDate(),(i+1));
            contract.getInstallments().add(new Installment(date, totalInstallment));
        }
    }
}