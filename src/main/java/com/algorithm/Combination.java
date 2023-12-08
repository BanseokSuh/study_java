package com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    /**
     * 조합
     * - 서로 다른 n개에서 r개를 뽑아서 정렬하는 경우의 수
     * - 순서가 없음
     * - 예를 들어 [1,2]와 [2,1]은 서로 같음
     */

    /**
     * @param arr
     * @param visited
     * @param start
     * @param depth
     * @param r
     */
    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r) {
        List<Integer> combinationList = new ArrayList<>();

        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) combinationList.add(arr[i]);
            }
            System.out.println("Combination list = " + combinationList);
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }

    /**
     * DFS 트리, 다음 시작점이 중요
     * @param arr: 배열
     * @param r: 뽑을 개수
     * @param result: 결과값 담을 배열
     * @param depth
     * @param start: 다음 시작점
     */
    public static void combination2(int[] arr, int r, int[] result, int depth, int start) {
        /**
         * 종료
         */
        if (depth == r) {
            System.out.println("result = " + Arrays.toString(result));
        } else {
            for (int i = start; i < arr.length; i++) {
                result[depth] = arr[i];
                combination2(arr, r, result, depth+1, i+1); // 다음 시작점 설정
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        boolean[] visited = new boolean[arr.length];
//        int start = 0;
//        int depth = 0;
//        int r = 3;

//        combination(arr, visited, start, depth, r);


        int[] arr = {1, 2, 3, 4, 5};
        int r = 3;
        int[] result = new int[r];
        int depth = 0;
        int start = 0;

        combination2(arr, r, result, depth, start);
    }
}
