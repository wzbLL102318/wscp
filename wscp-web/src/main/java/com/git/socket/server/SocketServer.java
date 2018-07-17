package com.git.socket.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * User: wzb
 * Date: 2018/7/5
 * Time: 22:51
 * Version: 1.0
 * Description:
 */
public class SocketServer implements Runnable {

    private static ServerSocket serverSocket = null;
    private static final String PROT = "9900";
    private static InputStream in = null;
    private static BufferedReader bufferedReader = null;

    private static OutputStream outputStream = null;
    private static BufferedWriter bufferedWriter = null;

    private SocketServer() {
    }

    // volatile 屏蔽重排序
    private volatile static SocketServer instance = null;

    public static SocketServer getInstance() {
        if (instance == null) {
            synchronized (SocketServer.class) {
                if (instance == null) {
                    // JVM会执行三个步骤
                    instance = new SocketServer();
                }
            }
        }
        return instance;
    }

    public void sockerServer() {
        String response = null;
        while (true) {
            try {

                // 创建server 并监听PROT端口
                serverSocket = new ServerSocket(Integer.valueOf(PROT));
                Socket server = serverSocket.accept();
                server.setSoTimeout(3000);
                System.out.println("客户端连接成功" + server.getInetAddress());

                in = server.getInputStream();
//                DataInputStream dataInputStream = new DataInputStream(in);
//                System.out.println(dataInputStream.readUTF());
//                byte[] bytes = new byte[in.available()];
//                in.read(bytes);
//                System.out.println("接受到：" + new String(bytes));
                System.out.println("转换成功");
                bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
                response = bufferedReader.readLine();
                System.out.println("response:" + response);
                // 获取到一个输出流
                if(response != null){
                    System.out.println("服务端返回消息：");
                    outputStream = server.getOutputStream();
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                    bufferedWriter.write("我是服务端");
                    bufferedWriter.flush();
                    System.out.println("服务端消息已返回");
                    bufferedWriter.close();
                    outputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (in != null) {
                        in.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (!serverSocket.isClosed()) {
                        serverSocket.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void run() {
        sockerServer();
    }
}