package com.algorithm;

public class Permutation {
    /**
     * 순열
     * - 서로 다른 n개에서 r개를 뽑아서 정렬하는 경우의 수
     * - 순서가 있음
     *   - 예를 들어 [1,2]와 [2,1]은 순서가 다르기 때문에 서로 다름
     */


    /**
     * arr: 배열
     * out: 순열
     * visited:
     * depth: 재귀 depth
     * r: 뽑을 개수
     */
    public static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r) {
        /**
         * 재귀 depth가 r과 같을 경우 log
         */
        if (depth == r) {
            for (int num : out) {
                System.out.print(num);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, visited, depth + 1, r);
                visited[i] = false;
            }
        }
    }


    /**
     * {1,2,3,4,5} 중에 3개를 뽑기
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 3;

        permutation(arr, new int[r], new boolean[arr.length], 0, r);
    }
}
