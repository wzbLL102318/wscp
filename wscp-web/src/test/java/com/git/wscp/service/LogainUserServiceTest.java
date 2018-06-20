package com.git.wscp.service;

import com.git.wscp.test.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

public class LogainUserServiceTest extends BaseTest {
    @Resource
    private LogainUserService logainUserService;
    @Test
    public void findUserByID() {
        AtomicInteger countA = new AtomicInteger(0);
        AtomicInteger countB = new AtomicInteger(0);
        logger.info("====" + getType(countA));
        logger.info("====" + getType(countB));
        if (countA.equals(countB)) {
            logger.info("===================This is False");
        }else{
            logger.info("===================This is True");
        }



        logger.info("TTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }
    public static String getType(Object o){ //获取变量类型方法
        return o.getClass().toString(); //使用int类型的getClass()方法
    }
}