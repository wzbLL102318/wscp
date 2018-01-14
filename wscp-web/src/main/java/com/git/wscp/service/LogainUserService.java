package com.git.wscp.service;

import com.git.wscp.domain.UserDomain;

public interface LogainUserService {
    UserDomain findUserByID(String ID);
}