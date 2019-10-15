package thread;

public class Main {

    public static void main(String[] args) {
        String s = "10.131.1.66";
        String[] strings = s.split(".");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("------------------");
        String[] strings1 = s.split("//.");
        for (String s1 : strings1) {
            System.out.println(s1);
        }
    }

}
