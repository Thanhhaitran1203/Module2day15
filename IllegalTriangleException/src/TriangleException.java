public class TriangleException extends Exception{
    private String mess;

    public TriangleException(String message) {
        super(message);
        this.mess = message;
    }
}
