package org.evanfeng.hrserver.controller;

import org.evanfeng.hrserver.model.Menu;
import org.evanfeng.hrserver.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Evan Feng
 * @Date 30/8/2022
 * @Github https://github.com/EvanFung
 */
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {
    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public List<Menu> getMenuByHrId() {
        return menuService.getMenuByHrId();
    }
}
