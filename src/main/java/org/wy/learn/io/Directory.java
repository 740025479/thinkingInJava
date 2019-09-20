package org.wy.learn.io;

import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {


    public static java.io.File[] local(java.io.File dir,String regex){
        return dir.listFiles(new FileFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(java.io.File file) {
                return pattern.matcher(file.getName()).matches();
            }
        });
    }

    public static class TreeInfo{
        public List<java.io.File> files = new ArrayList<>();
        public List<java.io.File> dirs = new ArrayList<>();
        void addAll(TreeInfo other){
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }
    }

    static TreeInfo recurseDirs(java.io.File startDir,String regex){
        TreeInfo res = new TreeInfo();
        for (java.io.File file : startDir.listFiles()) {
            if (file.isDirectory()){
                res.dirs.add(file);
                res.addAll(recurseDirs(file,regex));
            }else {
                if (file.getName().matches(regex)){
                    res.files.add(file);
                }
            }
        }
        return res;
    }

}


