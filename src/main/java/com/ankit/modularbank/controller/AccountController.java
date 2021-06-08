package com.ankit.modularbank.controller;

import com.ankit.modularbank.gateway.producer.model.AccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping
    public String getAccount() {
        streamBridge.send("accountInsert-out-0",new AccountDetails());
        return "";
    }
}
