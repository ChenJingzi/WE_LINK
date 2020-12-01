package com.cjz.welink.backend.service.serviceimpl;

import com.cjz.welink.backend.service.UserPermissionService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Component
public class UserPermissionServiceImpl implements UserPermissionService {
    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {

        Object object=authentication.getPrincipal();
        if(object instanceof UserDetails){
            UserDetails userDetails=(UserDetails) object;
            Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
            return  authorities.contains(new SimpleGrantedAuthority(request.getRequestURI()));
        }
        return false;
    }
}
