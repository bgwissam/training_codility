import java.util.*;

public class Dominator {
    public int solution(int[] A) {

        int dominator = -1;
        int counter = 0;
        int maxCounter = 0;
        ArrayList<Integer> stck = new ArrayList<Integer>();

        if (A.length == 1) {
            return 0;
        }

        for (int a : A) {
            stck.add(a);
        }
        Arrays.sort(A);

        for (int a = 0; a < A.length - 1; a++) {
            if (A[a] == A[a + 1]) {
                counter++;
                if (a + 1 == A.length - 1) {
                    counter++;
                }

                if (counter > A.length / 2) {
                    dominator = A[a];
                }

            } else {

                if (maxCounter < counter) {
                    maxCounter = counter;
                    dominator = A[a];
                } else if (maxCounter == counter) {
                    return -1;
                }
                counter = 0;
            }

        }

        if (dominator != -1) {
            int pos = stck.indexOf(dominator);

            return pos;
        }

        return -1;
    }
}
