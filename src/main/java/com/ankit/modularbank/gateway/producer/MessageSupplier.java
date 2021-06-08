package com.ankit.modularbank.gateway.producer;

import com.ankit.modularbank.gateway.producer.model.AccountDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class MessageSupplier {

   /* @Bean
    public Supplier<AccountDetails> userProducer() {
        return () -> {
            AccountDetails accountDetails = new AccountDetails();
            accountDetails.setName("fds");
            return accountDetails;
        };
    }*/

}
