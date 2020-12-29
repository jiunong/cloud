package com.sict.cloud.user.controller;

import com.sict.cloud.user.model.UsersBO;
import com.sict.cloud.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getUser(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort: " + serverPort + "id" + id;
    }


    @GetMapping(value = "/user/{id}")
    public String getAllUser(@PathVariable String id){
        return Optional.ofNullable(userService.selectByPrimaryKey(id)).map(UsersBO::toString).orElse("");
    }
}
