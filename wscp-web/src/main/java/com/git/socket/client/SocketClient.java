package com.git.socket.client;

import java.io.*;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/5
 * Time: 22:52
 * Version: 1.0
 * Description:
 */
public class SocketClient {

    private SocketClient() {
    }

    private volatile static SocketClient socketClient = null;

    public static SocketClient getInstace() {
        if (socketClient == null) {
            synchronized (SocketClient.class) {
                if (socketClient == null) {
                    socketClient = new SocketClient();
                }
            }
        }
        return socketClient;
    }

    // IP
    private static final String IP = "169.254.34.123";
    // PROT
    private static final String PORT = "9900";

    private static Socket socket = null;

    public void socketClient() {
        try {
            socket = new Socket(IP, Integer.valueOf(PORT));

            // 管道
            OutputStream outputStream = socket.getOutputStream();
//            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//            dataOutputStream.writeUTF("hello World");
//            dataOutputStream.close();
            String request = "我是客户端的字符流";
//            System.out.println("消息开始发送");
//            outputStream.write(request.getBytes());
//            System.out.println("消息已经发送");
//            outputStream.flush();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            System.out.println("编码：" + outputStreamWriter.getEncoding());

            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(request);
            bufferedWriter.flush();
            socket.shutdownOutput(); // 关闭流则会关闭socket
            System.out.println("客户端接受服务端消息");
           InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String response = bufferedReader.readLine();
            System.out.println("response:" + response);
            bufferedReader.close();
            inputStream.close();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
