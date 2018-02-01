package warmup;

class Fourth {

    static int diagonalDifference(int[][] a) {
        int firstResult = 0, secondResult = 0;
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j) {
                    firstResult += a[i][j];
                }
                if (i + j == a[0].length - 1) {
                    secondResult += a[i][j];
                }
            }
        }
        return Math.abs(firstResult - secondResult);
    }
//    0,0
//    1,1
//    2,2
//    0,2
//    1,1
//    2,0


    public static void main(String[] args) {
        int n = 3;
        int[][] a = {{11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        int result = diagonalDifference(a);
        System.out.println(result);
    }
}
