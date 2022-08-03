package model.services;

public interface PaymentService {
	
	double paymentTax (double amount);
	double paymentFee (double amount, int months);

}
