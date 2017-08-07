package com.uidai.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Created by Jai on 8/7/17.
 */
@Component
@PropertySource("classpath:application.properties")
public  class GlobalConfig {

    // inject via application.properties
    @Value("${welcome.message:test}")
    public  String message = "Hello World";

    @Value("${terminalID}")
    public  String TERMINAL_ID = "public";
}
