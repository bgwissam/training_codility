
class Test {
    public static void main(String[] args) {
        countFactors();
    }

    static void test_one() {
        practice_test test = new practice_test();

        int[] A = { 1, 2, 3 };
        int sol = test.solution(A);

        System.out.println(sol);
    }

    static void distint() {
        Distinct test = new Distinct();

        int A[] = { 1, 2, 1, 3, 2, 1 };
        int result = test.solution(A);

        System.out.println(result);
    }

    static void countingDiscIntersections() {
        NumberOfDiscIntersections test = new NumberOfDiscIntersections();
        int[] A = { 1, 5, 2, 1, 4, 0 };

        int result = test.solution(A);
        System.out.println(result);
    }

    static void nestedString() {
        NestedString test = new NestedString();

        String A = "{[(){[(){[(){[(){[(){[(){[(){[()()]}()]}()]}()]}()]}()]}()]}()]}";

        System.out.println(test.solution(A));

    }

    static void killingFish() {

        Fish test = new Fish();
        int[] A = { 4, 3, 2, 1, 5 };
        int[] B = { 0, 1, 0, 0, 0 };

        System.out.println(test.solution(A, B));
    }

    static void dominator() {
        Dominator test = new Dominator();

        int[] A = { 0, 0, 1, 1 };

        System.out.println(test.solution(A));
    }

    static void equileader() {
        Dominator test = new Dominator();

        int[] A = { 4, 3, 4, 4, 4, 2 };

        System.out.println(test.solution(A));
    }

    static void maxSumSlice() {

        MaxSliceSum test = new MaxSliceSum();

        int[] A = { 3, 2, -6, 4, 0 };

        System.out.println(test.solution(A));
    }

    static void countFactors() {
        CountFactors test = new CountFactors();

        int N = 479001600;
        System.out.println(test.solution(N));
    }
}
