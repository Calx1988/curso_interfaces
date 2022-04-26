package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalPaymentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Enter contract data-----");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Date (dd/mm/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        scanner.nextLine();
        Date date = sdf.parse(scanner.nextLine());
        System.out.print("Contract value ($): ");
        double value = scanner.nextDouble();
        System.out.print("Installment number: ");
        int installmentNumber = scanner.nextInt();
        Contract contract = new Contract(number, date, value);
        ContractService contractService = new ContractService(new PaypalPaymentService());
        contractService.processContract(contract,installmentNumber);
        for (Installment it: contract.getInstallments())
             {
                 System.out.println(it);
        }

    }
}
