package model.entities;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Contract {

	private List<Installment> installments = new ArrayList<>();

	private Integer number;
	private Date date;
	private Double totalValue;

	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

}
