import java.util.Arrays;

public class Method1 extends Main{

    public static void method1 (String[] args) {

        int i;
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();

        for (i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }
}
