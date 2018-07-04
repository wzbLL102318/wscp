package com.git.wscp.service;

import javax.jws.WebService;

/**
 * User: wzb
 * Date: 2018/7/1
 * Time: 2:20
 * Version: 1.0
 * Description:
 */
@WebService
public interface HelloWorld {

    /**
     * 调用WebServer
     * @param name
     * @return
     */
    String getWebServer(String name);
}
