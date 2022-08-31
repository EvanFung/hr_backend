package org.evanfeng.hrserver.controller;

import org.evanfeng.hrserver.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Evan Feng
 * @Date 6/8/2022
 * @Github https://github.com/EvanFung
 */
@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("Please login");
    }
}
