package warmup;

import java.util.Scanner;

class Second {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int[] an = {a0, a1, a2};
        int[] bn = {b0, b1, b2};
        int results[] = {0, 0};

        for (int i = 0; i < an.length; i++) {
            validate(an[i], bn[i]);
            if (an[i] > bn[i]) {
                results[0]++;
            } else if (an[i] < bn[i]) {
                results[1]++;
            }
        }
        return results;
    }

    private static void validate(final int i, final int i1) {
        if ((1 > i || i > 100) || (1 > i1 || i1 > 100)) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
