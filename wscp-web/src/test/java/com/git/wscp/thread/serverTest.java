package com.git.wscp.thread;

import com.git.thread.server.SocketServer;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 14:20
 * Version: 1.0
 * Description:
 */
public class serverTest {
    public static void main(String[] args) {
        SocketServer.getInstance().runServer();
    }
}
