package app.domain.model;

import java.sql.Date;

public class Procedure {
	
	private int orderNumber;
	private int idProcedure;
	private int quantity;
	private String frecuency;
	private String requiresSpecialist;
	private int idSpecialist;
	private int item;
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getIdProcedure() {
		return idProcedure;
	}
	public void setIdProcedure(int idProcedure) {
		this.idProcedure = idProcedure;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFrecuency() {
		return frecuency;
	}
	public void setFrecuency(String frecuency) {
		this.frecuency = frecuency;
	}
	public String getRequiresSpecialist() {
		return requiresSpecialist;
	}
	public void setRequiresSpecialist(String requiresSpecialist) {
		this.requiresSpecialist = requiresSpecialist;
	}
	public int getIdSpecialist() {
		return idSpecialist;
	}
	public void setIdSpecialist(int idSpecialist) {
		this.idSpecialist = idSpecialist;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}

	

}
