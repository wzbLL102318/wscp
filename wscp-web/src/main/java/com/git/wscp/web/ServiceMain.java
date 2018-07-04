package com.git.wscp.web;

import com.git.wscp.service.HelloWorld;
import com.git.wscp.service.impl.HelloWorldImpl;

import javax.xml.ws.Endpoint;

/**
 * User: wzb
 * Date: 2018/7/1
 * Time: 2:31
 * Version: 1.0
 * Description:
 */
public class ServiceMain {
    public static void main(String args[]){
        HelloWorld hw = new HelloWorldImpl();
        //调用Endpoint的publish方法发布Web Service
        Endpoint.publish("169.254.34.123/vashon", hw);
        System.out.println("Web Service暴露成功！");
    }
}
