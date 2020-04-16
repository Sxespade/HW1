package HomeWork5;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);


        //Однопоточность
        long a = System.nanoTime();
        fillArrayValue(SIZE, arr);
        long duration = System.nanoTime() - a;
        System.out.printf("Однопоточность заняла %d ms%n",TimeUnit.NANOSECONDS.toMillis(duration));
        //Однопоточность


        // Многопоточность
        long b = System.nanoTime();

        Thread thread1 = new Thread(() -> fillArrayValue(arr1.length, arr1));
        Thread thread2 = new Thread(() -> fillArrayValue2(HALF,arr2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        float[] array = new float[SIZE];
        System.arraycopy(arr1, 0, array, 0, HALF);
        System.arraycopy(arr2, 0, array, HALF, HALF);

        System.out.printf("Многопоточность заняла %d ms%n",TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - b));

        System.out.println("Arrays are equal: " + Arrays.equals(arr, array));
        // Многопоточность
    }


    private static void fillArrayValue(int size, float[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void fillArrayValue2(int size, float[] arr2) {
        for (int i = 0; i < size; i++) {
            int j = i + size;
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
    }
}