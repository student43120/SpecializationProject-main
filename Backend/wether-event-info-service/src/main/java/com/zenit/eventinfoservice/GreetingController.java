package com.zenit.eventinfoservice;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/greeting")
    public String greeting() {
        return  String.format("Hello from '%s'! " +
                ": this url if you want view a events: " +
                "<a href=\"http://localhost:8081/event/list\" >LIST OF EVENTS</a>",eurekaClient.getApplication(appName).getName());
    }

}