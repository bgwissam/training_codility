
class Test {
    public static void main(String[] args) {
        killingFish();
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

}
