package in.oliverit.ecomm.service;

import in.oliverit.ecomm.model.EmailDetails;

public interface EmailService {

    public String sendMailWithAttachment(EmailDetails details);
}
