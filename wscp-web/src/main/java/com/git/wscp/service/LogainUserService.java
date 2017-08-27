package com.git.wscp.service;

import com.git.wscp.domain.UserDomain;


/**
 * Created by ShallowDream on 2017/8/27.
 */
public interface LogainUserService {
    /**
     * 查询登陆用户记录列表
     */
    UserDomain findUserByID(String ID);
}