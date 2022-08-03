package model.services;

import java.util.Date;
import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private PaymentService PaymentService;
	
	public ContractService(PaymentService PaymentService) {
		this.PaymentService = PaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            Date date = addMonths(contract.getDate(), i);
            double updatedQuota = basicQuota + PaymentService.paymentFee(basicQuota, i);
            double fullQuota =  updatedQuota + PaymentService.paymentTax(updatedQuota);
            contract.addInstallment(new Installment(date, fullQuota));
        }
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return (Date) cal.getTime();
	}

}
