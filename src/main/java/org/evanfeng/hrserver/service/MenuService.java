package org.evanfeng.hrserver.service;

import org.evanfeng.hrserver.mapper.MenuMapper;
import org.evanfeng.hrserver.model.Hr;
import org.evanfeng.hrserver.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Evan Feng
 * @Date 30/8/2022
 * @Github https://github.com/EvanFung
 */
@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenuByHrId() {
        return menuMapper.getMenuByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }
}
