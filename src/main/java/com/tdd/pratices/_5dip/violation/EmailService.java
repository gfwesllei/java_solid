package com.tdd.pratices._5dip.violation;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EmailService {

    Log logger = LogFactory.getLog(EmailService.class);

    public void send(String toEmail,String subject){
        logger.info(String.format("Send email toEmail: %s",toEmail));
        logger.info(String.format("Subject email: %s",subject));
    }
}
