
class Test {
    public static void main(String[] args) {
        countingDiscIntersections();
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

}
