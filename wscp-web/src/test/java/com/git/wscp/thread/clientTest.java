package com.git.wscp.thread;

import com.git.thread.client.SocketClient;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 15:15
 * Version: 1.0
 * Description:
 */
public class clientTest {
    public static void main(String[] args) {
        SocketClient.getInstance().runClient();
    }
}
