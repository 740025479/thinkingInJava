package org.wy.learn.serializable;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 测试
 * 序列化中，
 * 如何保证date显示的是实时时间
 * 序列化和反序列化只是将数据存和取，没有调用任何方法，所以要么为null，要么跟序列化之前的时间一样
 */
public class TestTransient implements Serializable{

    private Date date = new Date();
    private String userName;
    private transient String password;

    public TestTransient(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("userName:").append(userName).append("\n")
                                  .append("password:").append(password).append("\n")
                                  .append("date:").append(date).toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        TestTransient testTransient = new TestTransient("wy","123456");
        System.out.println(testTransient);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.out"));
        objectOutputStream.writeObject(testTransient);

        TimeUnit.SECONDS.sleep(1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.out"));
        System.out.println("Recovering object at"+ new Date());
        testTransient = (TestTransient)objectInputStream.readObject();
        System.out.println(testTransient);
    }


}
