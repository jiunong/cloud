package com.sict.cloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author xuhong.ding
 * @since 2020/12/25 13:56
 */
@RestController
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getUser(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: " + serverPort + "id" + id;
    }
}
