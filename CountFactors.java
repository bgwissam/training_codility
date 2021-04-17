public class CountFactors {
    public int solution(int N) {
        int factors = 0;

        for (int n = 1; n <= N; n++) {
            if (N % n == 0) {
                factors++;
            }
        }

        return factors;

    }
}
