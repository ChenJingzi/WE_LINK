package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.domain.SysRole;
import com.cjz.welink.backend.domain.SysUser;
import com.cjz.welink.backend.service.UserDetailService1;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class UserDetailService1Impl implements UserDetailService1 {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {


        SysRole sysRole=new SysRole();
        sysRole.setId(1);
        sysRole.setRoleDesc("USER");
        sysRole.setRoleName("USER");

        List<SysRole>list=new ArrayList<>();
        list.add(sysRole);

        SysUser sysUser=new SysUser();
        sysUser.setId(1);
        sysUser.setPassword("$2a$10$GydDp3ubrJR.XOsyzQtHX.5rkY53tx2PZllxuHBv9J8G4rOKdYAtq");
        sysUser.setRoles(list);
        sysUser.setStatus(1);
        sysUser.setUsername("Chen");

        return sysUser;

    }

}
