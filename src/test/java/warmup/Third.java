package warmup;

class Third {

    static long aVeryBigSum(int n, long[] ar) {
        long result = 0;
        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
        }
        return result;
    }

    public static void main(String[] args) {
        long[] ar = {5, 1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        int n = ar.length;

        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
