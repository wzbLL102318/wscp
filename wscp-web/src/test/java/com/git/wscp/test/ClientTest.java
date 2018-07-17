package com.git.wscp.test;

import com.git.socket.client.SocketClient;

/**
 * User: wzb
 * Date: 2018/7/5
 * Time: 23:33
 * Version: 1.0
 * Description:
 */
public class ClientTest {
    public static void main(String[] args) {
        SocketClient socketClient = SocketClient.getInstace();
        socketClient.socketClient();
    }
}
