package in.oliverit.ecomm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.oliverit.ecomm.entity.Order;

@Service
public interface OrderService {

	public Order updateOrder(Order order);

	public void deleteInvoiceFromLocalStorage(String orderTrackingNumber);
		
	public List<Order> getOrdersEligibleForDelivery();
	
	public List<Order> getUnconfimedOrders();

	public String getInvoiceName(String orderTrackingNumber);

}