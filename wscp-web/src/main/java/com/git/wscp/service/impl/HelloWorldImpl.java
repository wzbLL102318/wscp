package com.git.wscp.service.impl;

import com.git.wscp.service.HelloWorld;

import javax.jws.WebService;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: wzb
 * Date: 2018/7/1
 * Time: 2:23
 * Version: 1.0
 * Description:
 */
//指定webservice所实现的接口以及服务名称
@WebService(endpointInterface="com.git.wscp.service.HelloWorld",serviceName="HelloWorld_WS")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getWebServer(String name) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return name+"您好！现在时间是："+ simpleDateFormat.format(date);
    }

}
