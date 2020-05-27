package com.example.consumber;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    private RestTemplate restTemplate;

    @RequestMapping("/api/v1/demo/get")
    public String consumer(){
        restTemplate = new RestTemplate();
        //跳转
        return this.restTemplate.getForObject("http://localhost:6060/producer/demo", String.class);
    }

}
