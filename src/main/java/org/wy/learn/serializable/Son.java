package org.wy.learn.serializable;

import java.io.*;

public class Son extends TestExternalizable {


    int b;

    @Override
    public String toString() {
        return new StringBuilder().append("i=").append(i).append("\n")
                .append("S=").append(s).append("\n")
                .append("b=").append(b).append("\n")
                .append("a=").append(a).append("\n").toString();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
//        super.writeExternal(out);
        out.writeInt(b);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        super.readExternal(in);
        b = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Son son = new Son();
        son.a=1;
        son.i=2;
        son.s="king";
        son.b=3;
        System.out.println(son);

        Son.c=6;


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ss.out"));
        oos.writeObject(son);
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ss.out"));
        Son son2 = (Son)ois.readObject();
        System.out.println(son2);
    }
}
