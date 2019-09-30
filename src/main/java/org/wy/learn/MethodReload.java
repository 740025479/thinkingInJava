package org.wy.learn;

public class MethodReload {

    public static void main(String[] args) {

        short a =5;
        methodReload(a);
    }


    public static void k(String a){
        System.out.println(a);
    }


//    static void methodReload(short a){
//        System.out.println("参数为short");
//    }

//
//    static void methodReload(int a){
//        System.out.println("参数为int");
//    }


    static void methodReload(long a){
        System.out.println("参数为long");
    }

    static void methodReload(float a){
        System.out.println("参数为float");
    }

    static void methodReload(double a){
        System.out.println("参数为double");
    }
}
