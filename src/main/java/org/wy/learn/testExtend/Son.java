package org.wy.learn.testExtend;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;

public class Son extends Father {

    int k = 3;
    public static void main(String[] args) {
        Father father = new Son();

        int a = 1;
        father.a(a);
        Son son = (Son) father;
        son.a(a);

    }


    private static int fatherA(){
        System.out.println("son.fatherA");
        return 11;

    }


    public static int fatherB(){
        System.out.println("son.fatherB");
        return 22;
    }


    public void a(int k){
        System.out.println("son : a()");

    }

    public void a(){
        System.out.println("son:a() a()");
    }

}
