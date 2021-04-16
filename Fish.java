import java.util.*;

public class Fish {
    public int solution(int[] A, int[] B) {

        Stack<Integer> stream = new Stack<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (stream.isEmpty()) {
                stream.push(i);
                // System.out.println("Empty Stream: " + stream);
            } else {
                while (!stream.isEmpty() && B[i] - B[stream.peek()] == -1 && A[stream.peek()] < A[i]) {
                    stream.pop();
                    // System.out.println("While Loop: " + stream);
                }
                if (!stream.empty()) {
                    if (B[i] - B[stream.peek()] != -1) {
                        stream.push(i);
                        // System.out.println("Push New i 1:" + stream);
                    }

                } else {
                    stream.push(i);
                    // System.out.println("Push New i 2:" + stream);
                }
            }

        }

        return stream.size();
    }
}
