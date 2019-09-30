package org.wy.learn.serializable;

import java.io.*;

/**
 * 实现externalizable接口的类必须要有默认构造函数
 * write和read方法对应变量的顺序要一致
 */
public class TestExternalizable implements Externalizable {
    static int c;
    int i;
    int a;
    String s;

    public TestExternalizable() {
    }

    public TestExternalizable(int i, int a, String s) {
        this.i = i;
        this.s = s;
        this.a = a;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(i);
        out.writeInt(a);
        out.writeObject(s);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        a = in.readInt();
        i = in.readInt();
        s = (String) in.readObject();
    }

    @Override
    public String toString() {
        return new StringBuilder().append("i=").append(i).append("\n")
                .append("S=").append(s).append("\n")
                .append("a=").append(a).append("\n").toString();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TestExternalizable testExternalizable = new TestExternalizable(2, 3, "wy");
        System.out.println(testExternalizable);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("kk.out"));
        objectOutputStream.writeObject(testExternalizable);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("kk.out"));
        TestExternalizable t2 = (TestExternalizable) objectInputStream.readObject();
        System.out.println(t2);
    }
}
