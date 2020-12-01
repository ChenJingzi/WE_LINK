package com.cjz.welink.backend.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

     boolean judgementPasswordAccordingUserName(String username,int password);

     String getPaasowordByUserName(String username);

     //boolean judgementUserExit(String );
}
