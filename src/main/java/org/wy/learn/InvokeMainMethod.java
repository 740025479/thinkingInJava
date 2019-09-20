package org.wy.learn;

public class InvokeMainMethod {

    public static void main(String[] args) {
        String[] strings = {"wuyu","love","you"};
        System.out.println("invoker's Main method");
        InvokeMainMethod2.main(strings);

    }


}
