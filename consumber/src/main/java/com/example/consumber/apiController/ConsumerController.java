package com.example.consumber.apiController;


import com.example.consumber.Feign.FeignClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired(required = false)
    private FeignClientService feignClientService;

    @HystrixCommand(fallbackMethod = "executeHystrixHandle")
    @RequestMapping("/api/v1/demo/get")
    public String consumerMessage(){
        //交给消费者处理
        return feignClientService.getProducerMessage();
    }

    //服务进入保护时，回调方法
    public String executeHystrixHandle() {
        return  "Hello, the current system has a large number of people, please try again later, please forgive me for the inconvenience! ! !";
    }


}
