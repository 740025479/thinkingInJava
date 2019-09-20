package org.wy.learn.testInterface;

public class Main {

    private Dao dao = new DaoImpl();

    public void test(){
        int id =1;
        dao.update(id);
    }

    public static void main(String[] args) {
        new Main().test();
    }

}
