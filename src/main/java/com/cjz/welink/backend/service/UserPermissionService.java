package com.cjz.welink.backend.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface UserPermissionService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
