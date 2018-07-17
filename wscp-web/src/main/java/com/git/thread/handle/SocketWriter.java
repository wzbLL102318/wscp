package com.git.thread.handle;

import java.io.*;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/8
 * Time: 14:30
 * Version: 1.0
 * Description:
 */
public class SocketWriter extends Thread {
    private Socket socket;
    private BufferedWriter bufferedWriter;

    // 创建对象时加载
    public SocketWriter(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            String message = "Hello Server";
            bufferedWriter.write(message);
            bufferedWriter.flush();
            bufferedWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
