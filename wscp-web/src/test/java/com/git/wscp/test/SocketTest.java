package com.git.wscp.test;


import com.git.socket.server.SocketServer;

/**
 * User: wzb
 * Date: 2018/7/5
 * Time: 23:20
 * Version: 1.0
 * Description:
 */
public class SocketTest {
    public static void main(String[] args) {
        SocketServer socketServer = SocketServer.getInstance();
        Thread thread = new Thread(socketServer);
        thread.start();
    }
}
