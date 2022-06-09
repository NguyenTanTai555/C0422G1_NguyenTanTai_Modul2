package ss3_array_method.array.bai_tap;

public class SumArr2 {
    public static void main(String[] args) {
        int m = 5, n = 5;
        int[][] newArray = Task.array2d(m, n);
        int sum = 0, i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i == j){
                    sum += newArray[i][j];
                }
            }
        }
        System.out.println("sum gon = "+ sum );
    }
}
