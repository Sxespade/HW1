package HomeWork2;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j) {
        super("В ячейке [" + i + "][" + j + "] лежит не число!");
    }
}
