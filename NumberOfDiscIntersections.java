import java.util.ArrayList;
import java.util.Collections;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int res = 0;
        int openDisNumber = 0;
        int max_intersections = 10000000;

        ArrayList<Integer> open_discs = new ArrayList<Integer>();
        ArrayList<Integer> closed_discs = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {

            open_discs.add(i - A[i]);
            closed_discs.add(A[i] + i);
        }

        Collections.sort(open_discs);
        Collections.sort(closed_discs);
        int i = 0;
        for (int j = 0; j < open_discs.size(); j++) {

            if (open_discs.get(j) <= closed_discs.get(i)) {
                if (openDisNumber >= 1)
                    res = res + openDisNumber;
                openDisNumber++;

                if (res > max_intersections) {
                    return -1;
                }
            } else if (open_discs.get(j) > closed_discs.get(i)) {
                i++;
                j--;
                openDisNumber--;
            }

        }

        return res;
    }
}