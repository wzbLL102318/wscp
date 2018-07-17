package com.git.thread.server;

import com.git.thread.handle.SocketReader;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 14:11
 * Version: 1.0
 * Description:
 */
public class SocketServer {
    private SocketServer() {
    }

    private static volatile SocketServer socketServer = null;

    public static SocketServer getInstance() {
        if (socketServer == null) {
            synchronized (SocketServer.class) {
                if (serverSocket == null) {
                    socketServer = new SocketServer();
                }
            }
        }
        return socketServer;
    }

    private static final String PORT = "9901";
    private static ServerSocket serverSocket = null;
    private static Socket socket = null;

    public void runServer() {
        try {
            serverSocket = new ServerSocket(Integer.valueOf(PORT));
            // 循环获取客户端接受
            System.out.println("服务端开启");
            socket = serverSocket.accept();
            socket.setSoTimeout(2000);
            new SocketReader(socket).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
