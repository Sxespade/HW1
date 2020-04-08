package HomeWork2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[3][4];

        fillArray(arr);

        try {
            try {
                arraySum(arr);
            } catch (MyArraysSizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    private static void fillArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "s";
            }
        }
    }

    private static void arraySum(String[][] arr) throws MyArraysSizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraysSizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(sum);
    }
}