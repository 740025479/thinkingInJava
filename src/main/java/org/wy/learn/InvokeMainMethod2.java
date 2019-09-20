package org.wy.learn;

public class InvokeMainMethod2 {

    public static void main(String[] args) {
        System.out.println("be invoked ");
        for (String str:args
             ) {
            System.out.println(str);
        }
    }
}
