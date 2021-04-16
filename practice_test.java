import java.util.Arrays;

public class practice_test {
    public int solution(int[] A) {
        int b = 0;
        Arrays.sort(A);

        for (int i = 0; i < A.length - 1; i++) {
            System.out.println(A[i]);
            if (A[i] == A[i + 1] && A[i] > 0) {
                continue;
            } else if (A[i] + 1 == A[i + 1] && A[i] > 0) {
                continue;
            } else {
                if (A[i] + 1 > 0) {
                    b = A[i] + 1;
                    return b;
                } else {
                    b = 1;
                    return b;
                }
            }

        }
        b = A[A.length - 1] + 1;
        return b;
    }
}
