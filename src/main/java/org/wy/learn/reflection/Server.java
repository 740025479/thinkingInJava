package org.wy.learn.reflection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

            Socket socket = serverSocket.accept();
            //new Thread(new handle(socket)).start();
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
        OutputStream os = socket.getOutputStream();
        PrintWriter bw = new PrintWriter(os);
            String s = null;
//            String res = "";
            while ((s=br.readLine())!=null){
//                res+=s;
                System.out.println("客户端说:"+s);
                bw.println("客户端，你好");
                bw.flush();
            }


            //socket.shutdownOutput();

    }

    static class handle implements Runnable{
        private Socket socket;

        public handle(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run(){
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String s = null;
                String res = "";
                while ((s=br.readLine())!=null){
                    res+=s;
                    System.out.println(res);
                }
                OutputStream os = socket.getOutputStream();

                PrintWriter bw = new PrintWriter(os);
                bw.print("客户端，你好");
                bw.flush();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
