import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Object obj[] = new Object[3];
        System.out.println("tên của obj");
        try {
            System.out.println(obj[2].equals("a"));
        }catch (NullPointerException e ){
            System.out.println(e);
        }
        System.out.println("------------");
        try {
            System.out.println(obj[4]);
        }catch (ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }
    }
}