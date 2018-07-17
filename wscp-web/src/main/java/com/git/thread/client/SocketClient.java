package com.git.thread.client;

import com.git.thread.handle.SocketWriter;

import java.io.IOException;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 14:13
 * Version: 1.0
 * Description:
 */
public class SocketClient {
    private SocketClient() {
    }

    private static volatile SocketClient socketClient = null;

    public static SocketClient getInstance() {
        if (socketClient == null) {
            synchronized (SocketClient.class) {
                if (socketClient == null) {
                    socketClient = new SocketClient();
                }
            }
        }
        return socketClient;
    }

    private static Socket socket;
    private static final String HOST_IP = "127.0.0.1";
    private static final String PORT = "9901";


    public void runClient() {
        try {
            socket = new Socket(HOST_IP, Integer.valueOf(PORT));
            System.out.println("客户端");
            new SocketWriter(socket).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
