public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws TriangleException {
        if (a<=0||b<=0||c<=0){
            throw new TriangleException("cạnh là số âm");
        }
        if ((a+b)<=c||(a+c)<=b||(b+c)<=c){
            throw new TriangleException("3 cạnh không tạo thành 1 tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
