package in.oliverit.ecomm.service;

import in.oliverit.ecomm.model.WatiResponse;

public interface WatiService {

	public WatiResponse sendDeliveryNotification(String phno,String name, String orderTrackingNumber);

	public WatiResponse sendPaymentReminder(String phno,String name, String orderTrackingNumber);

}
