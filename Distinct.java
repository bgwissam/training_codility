import java.util.ArrayList;
import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        int B = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (arr.contains(A[i])) {
                continue;
            } else {
                arr.add(A[i]);
            }
        }
        B = arr.size();
        return B;
    }
}
