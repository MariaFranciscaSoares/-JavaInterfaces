package model.services;

public class PaypalService implements PaymentService {

	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;

	@Override
	public double paymentTax(double amount) {
		return amount * FEE_PERCENTAGE;
	}

	@Override
	public double paymentFee(double amount, int months) {
		return amount * months * MONTHLY_INTEREST;
	}

}
