package com.fsl.demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fsl
 * @description: TODO
 * @date 2019-07-24 11:03
 */
@RestController
public class K8sController {

    @GetMapping("/")
    public String root() {
        return "Hello Kubernetes";
    }

    @GetMapping("/healthz")
    public String healthz() {
        return "ok";
    }
}
