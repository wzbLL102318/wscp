package com.git.thread.handle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 14:30
 * Version: 1.0
 * Description:
 */
public class SocketReader extends Thread {
    private Socket socket = null;
    private BufferedReader bufferedReader = null;

    // 创建对象时加载
    public SocketReader(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            String message = bufferedReader.readLine();
            System.out.println("message:" + message);
            bufferedReader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
