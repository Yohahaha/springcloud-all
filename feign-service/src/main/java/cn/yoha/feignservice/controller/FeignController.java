package cn.yoha.feignservice.controller;

import cn.yoha.feignservice.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService service;

    @GetMapping("/sayHello")
    public String hello() {
        return service.hello();
    }
}
