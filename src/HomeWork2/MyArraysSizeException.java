package HomeWork2;

public class MyArraysSizeException extends RuntimeException {

    public MyArraysSizeException() {
        super("Передан массив неправильных размеров!");
    }
}
