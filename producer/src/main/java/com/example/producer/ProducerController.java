package com.example.producer;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {


    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/producer/demo")
    public String produce(){
        return "I am from producer!"+"\n端口号为:"+serverPort;
    }

    @RequestMapping("/excuteHystrixHandler")
    private String excuteHystrixHandler(){
        return "您好，当前系统人数较多，请稍后重试，给您带来的不便，敬请谅解！！！";
    }

}
