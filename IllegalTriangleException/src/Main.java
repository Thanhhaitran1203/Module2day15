import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a, b, c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        try {
            Triangle triangle = new Triangle(a,b,c);
        }catch (TriangleException e){
            System.err.println(e.getMessage());
        }
    }
}