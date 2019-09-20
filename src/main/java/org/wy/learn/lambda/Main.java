package org.wy.learn.lambda;

public class Main {

    static int a = 1;
    public static void main(String[] args) {

        int k = 11;
        Converter<Integer,String> converter = (from -> {

            return String.valueOf(from+a);});
        String s = converter.convert(6);
        System.out.println(s);
        System.out.println(a);
        a=111;


//        Converter<String,Integer> converter = (from)->(int)from.charAt(0);
//        Integer converted = converter.convert(s);
//
//        converter.first(1);
//        System.out.println(converted.getClass());
//        System.out.println(converted);
//        Converter<String,Integer> converter1 = Conver::kkk;
//        Integer converted1 = converter1.convert("321");



//
//
//
//
//        int k = 2;
//        System.out.println(dsd(k));

    }


    private static int dsd(int n){
        return n++;
    }
}
