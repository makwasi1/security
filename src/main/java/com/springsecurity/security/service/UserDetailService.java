package com.springsecurity.security.service;

import com.springsecurity.security.entity.User;

public interface UserDetailService {
    User loadUserByUsername(String username);
}
