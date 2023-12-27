import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ:");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số "+x+" là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("chỉ số không hợp lệ");
        }
    }
    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}