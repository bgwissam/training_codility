
import java.util.*;

public class NestedString {
    public int solution(String S) {
        String[] A = S.split("");
        String aLeft = "(";
        String bLeft = "[";
        String cLeft = "{";

        Stack<String> stck = new Stack<String>();

        if (A.length == 0) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {

            if (A[i].equals(aLeft) || A[i].equals(bLeft) || A[i].equals(cLeft)) {

                stck.push(A[i]);
            } else {
                if (i == A.length - 1 && stck.size() != 1) {
                    return 0;
                }
                if (stck.empty()) {
                    return 0;
                }
                String c = stck.pop();
                switch (A[i]) {
                case ")":
                    if (!c.equals(aLeft)) {
                        return 0;
                    }
                    break;
                case "]":
                    if (!c.equals(bLeft)) {
                        return 0;
                    }
                    break;
                case "}":
                    if (!c.equals(cLeft)) {
                        return 0;
                    }
                    break;
                default:
                    break;

                }
            }
        }

        return 1;
    }
}
