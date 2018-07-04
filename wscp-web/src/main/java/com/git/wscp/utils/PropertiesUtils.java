package com.git.wscp.utils;

import java.io.*;
import java.util.Properties;

/**
 * User: wzb
 * Date: 2018/7/4
 * Time: 20:25
 * Version: 1.0
 * Description:
 */
public class PropertiesUtils {
    private static Properties properties;
    private static InputStream inputStream;

    /*
      读取配置文件
      */
    static {
        try {
            properties = new Properties();
            // 只能通过类加载
            ClassLoader classLoader = PropertiesUtils.class.getClassLoader();
            inputStream = classLoader.getResourceAsStream("jdbc_con.properties");

            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                    inputStream = null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }
}

