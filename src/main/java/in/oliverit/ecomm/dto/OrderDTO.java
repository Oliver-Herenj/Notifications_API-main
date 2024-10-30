package in.oliverit.ecomm.dto;

import java.util.List;

import in.oliverit.ecomm.entity.Address;
import in.oliverit.ecomm.entity.Customer;
import in.oliverit.ecomm.entity.OrderItem;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class OrderDTO {

    private int totalquantity;
    private double totalprice;
    private String razorPayOrderId;
    private String orderStatus;
    private String razorpayPaymentId;
    
    @ManyToOne
    private Customer customer;
    
    @ManyToOne
    private Address address;
    
    @ElementCollection
    private List<OrderItem> orderItems; 
}
