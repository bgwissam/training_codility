public class MaxSliceSum {
    public int solution(int[] A) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
