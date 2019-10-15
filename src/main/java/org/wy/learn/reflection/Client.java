package org.wy.learn.reflection;

import org.wy.learn.testExtend.Son;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, IOException {
        Socket socket = new Socket("localhost",8888);

        OutputStream os = socket.getOutputStream();
        PrintWriter bw = new PrintWriter(os);
        //bw.print("服务端你好");
        bw.println("丢你螺母");
//        bw.flush();

        bw.println("阿西吧");
        bw.flush();
        //socket.shutdownOutput();




        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = null;
        while ((s=br.readLine())!=null){
            System.out.println("服务端:"+s);
        }
    }

}
