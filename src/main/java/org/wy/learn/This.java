package org.wy.learn;

/*
  一个类中的非STATIC方法会自带当前对象的引用，就是this关键字，
  所以同一类下的非STATIC修饰的方法可以互相调用
 */

public class This {

    public static void main(String[] args) {
        new This().firstMethod();
    }

    void firstMethod(){

        return ;

    }


    void secondMethod(){
        firstMethod();
    }

}
