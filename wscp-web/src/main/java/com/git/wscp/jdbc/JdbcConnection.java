package com.git.wscp.jdbc;

import com.git.wscp.utils.PropertiesUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * User: wzb
 * Date: 2018/7/4
 * Time: 20:22
 * Version: 1.0
 * Description: jdbc 工具类
 */
public abstract class JdbcConnection {

    // 创建一个本地线程，防止死锁
    private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();

    private static final String DRIVER_CLASS = PropertiesUtils.getValue("jdbc.driver");
    private static final String URL = PropertiesUtils.getValue("jdbc.url");
    private static final String USER_NAME = PropertiesUtils.getValue("jdbc.username");
    private static final String PASSWORD = PropertiesUtils.getValue("jdbc.password");

    static {
        try {
            // 反射 加载驱动
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 连接
     *
     * @return
     */
    public static Connection getConnection() {
        Connection conn = null;
        // 从本地线程中获取一个连接
        try {
            conn = THREAD_LOCAL.get();
            if (conn == null) {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                THREAD_LOCAL.set(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection() {
        Connection conn = THREAD_LOCAL.get();
        try {
            if (conn != null) {
                if (!conn.isClosed()) {
                    conn.close();
                    THREAD_LOCAL.remove();
                    conn = null;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
