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

    @RequestMapping("/actuator/info")
    public String greeting() {
        return  String.format("Hello from '%s'! " +
                ": write this url if you want vie a events:" +
                " http://localhost:8081/event/list",eurekaClient.getApplication(appName).getName());
    }

}
