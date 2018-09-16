import java.util.Arrays;

public class Method2 extends Main{

    public static void method2(){
         int i;
        float[] arr = new float[size];
        float[] a1 = new float[size];
        float[] a2 = new float[size];
        Arrays.fill(arr, 1);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                 for (int i = 0; i < h; i++) {
                     a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                  }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        long b = System.currentTimeMillis();

        System.arraycopy(arr,0, a1 ,0, h);
        System.arraycopy(arr,h, a2 ,0, h);

        t1.start();
        t2.start();


        System.arraycopy(a1,0, arr ,0, h);
        System.arraycopy(a2,0, arr ,h, h);

        long c =System.currentTimeMillis();
        System.out.println(c - b);

    }

}
