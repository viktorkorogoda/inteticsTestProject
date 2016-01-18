package com.viktarkarahoda.inteticstestproject.entity;

import com.viktarkarahoda.inteticstestproject.enums.OrderStatus;

public class Order {
	private int idOrder;
	private int idCar;
	private int idClient;
	private int cost;
	private String orderdate;
	private OrderStatus orderStatus = OrderStatus.IN_PROGRESS;

	public int getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	public int getIdCar() {
		return idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getDateOrder() {
		return orderdate;
	}

	public void setOrderDate(String orderdate) {
		this.orderdate = orderdate;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}
