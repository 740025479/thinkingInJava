package org.wy.learn.io;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Pattern;

public class File {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("/Users/wuyu/Desktop");
        Pattern pattern = Pattern.compile(".+\\..*");
        DirFilter dirFilter = new DirFilter(pattern);
        String[] files = file.list(dirFilter);
        for (String s : files) {
            System.out.println(s);
        }
    }

}
