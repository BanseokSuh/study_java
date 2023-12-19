package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class DuplicatePermutation {

    public static void permutation(int[] arr, int r, int[] out, int depth) {
        List<Integer> permutationList = new ArrayList<>();

        if (depth == r) {
            for (int num : out) {
                permutationList.add(num);
            }
            System.out.println("permutationList = " + permutationList);
            return;
        }

        /**
         * 중복순열은 visited를 생각하지 않는다.
         */
        for (int i = 0; i < arr.length; i++) {
            out[depth] = arr[i];
            permutation(arr, r, out, depth+1);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 3;

        int[] out = new int[r];
        int depth = 0;

        permutation(arr, r, out, depth);
    }
}
