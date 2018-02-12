package warmup;

import org.junit.Test;

import java.util.Arrays;

public class Sixth {

    @Test
    public void test() {
        int n = 6;
        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }

    void plusMinus(int[] arr) {
        System.out.printf("%.6f %n", (double) Arrays.stream(arr).filter(o -> o > 0.0).count() / arr.length);
        System.out.printf("%.6f %n", (double) Arrays.stream(arr).filter(o -> o < 0.0).count() / arr.length);
        System.out.printf("%.6f %n", (double) Arrays.stream(arr).filter(o -> o == 0.0).count() / arr.length);
    }
}
