package org.evanfeng.hrserver.service;

import org.evanfeng.hrserver.mapper.HrMapper;
import org.evanfeng.hrserver.model.Hr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author Evan Feng
 * @Time 3/8/2022
 * @Github https://github.com/EvanFung
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(username);
        if(hr == null) {
            throw new UsernameNotFoundException("Username does not exist");
        }
        return hr;
    }
}
