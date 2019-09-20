package org.wy.learn.testExtend;

public class Father {


    public static void main(String[] args) {
        test(new Son());
    }

    public static void test(Father father){
        father.fatherA();
    }


    private int fatherA(){
        System.out.println("fatherA");
        return 1;
    }


    protected static int fatherB(){
        System.out.println("fatherB");
        return 2;
    }



    public void a(long k){
        System.out.println("father: a()");
    }

}
