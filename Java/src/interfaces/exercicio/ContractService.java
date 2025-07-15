package interfaces.exercicio;

import java.time.LocalDate;

public class ContractService {

    private OneLinePaymentService onLinePaymentService;

    public ContractService(OneLinePaymentService onLinePaymentService) {
        this.onLinePaymentService = onLinePaymentService;
    }

    public void processContract(Contract contract, int months) {
      
      double basicQuota = contract.getTotalValue() / months;
      for(int i = 1; i <= months; i++) {
        LocalDate dueDate = contract.getDate().plusMonths(i);
        double interest = onLinePaymentService.interest(basicQuota,i);
        double fee = onLinePaymentService.paymentFee(basicQuota+interest);
        double quota = basicQuota + interest + fee;
        contract.getInstallments().add(new Installment(dueDate,quota));
      }
    }
}
