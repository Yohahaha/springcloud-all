package cn.yoha.feignservice.service;

import cn.yoha.feignservice.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user-service", configuration = {FeignConfig.class})
public interface FeignService {
    @GetMapping("/user")
    public String hello();
}
