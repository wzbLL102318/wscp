package com.git.wscp.test;

import com.git.wscp.jdbc.JdbcConnection;
import com.git.wscp.utils.PropertiesUtils;

import java.sql.Connection;

/**
 * User: wzb
 * Date: 2018/7/4
 * Time: 21:10
 * Version: 1.0
 * Description:
 */
public class JdbcTest {
    public static void main(String[] args) {
       String driver =  PropertiesUtils.getValue("jdbc.driver");
        System.out.println("driver=" + driver);
       Connection connection = JdbcConnection.getConnection();
        System.out.println("connection=" + connection);
    }
}
