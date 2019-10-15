package org.wy.learn;

import java.util.*;

public class HashSetTest {

    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Set<String> set = new HashSet<String>();
        String str1=new String("wy");
        String str2=new String("wy");
        System.out.println(str1==str2);
        System.out.println(str1.hashCode()==str2.hashCode());
        set.add(str1);
        set.add(str2);
        System.out.println(set);
        HashSetTest hashSetTest1 = new HashSetTest();
        HashSetTest hashSetTest2 = new HashSetTest();
        System.out.println(hashSetTest1.hashCode()==hashSetTest2.hashCode());

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"kk");
        map.put(2,"kk");
        System.out.println(map);
        System.out.println(map.values());

    }



}
