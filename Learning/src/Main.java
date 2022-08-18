public class Main {

    public static void main(String[] args) {

        int[] a1 = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
        int[] a2 = {-3, -3};
        int[] a3 = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5 ,0};
        int[] a4 = {3,3,3};
        int[] a5 = {3,3,3,1,1};

        Solution solution = new Solution();
        System.out.println(solution.solution(a1));
        System.out.println(solution.solution(a2));
        System.out.println(solution.solution(a3));
        System.out.println(solution.solution(a4));
        System.out.println(solution.solution(a5));

    }
}