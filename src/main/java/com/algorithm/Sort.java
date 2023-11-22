package com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        /***************************************************************************************************************************************************
         * Sorting array
         */
        int[] intArr = {6,3,2,1,5};
        String[] stringArr = {"h", "e", "a", "c"};

        /**
         * 오름차순
         */
        Arrays.sort(intArr);
        Arrays.sort(stringArr);
        System.out.println("Sorted intArr = " + Arrays.toString(intArr));
        System.out.println("Sorted stringArr = " + Arrays.toString(stringArr));

        /**
         * 문자 배열 내림차순
         */
        Arrays.sort(stringArr, Collections.reverseOrder());
        System.out.println("Reverse sorted stringArr = " + Arrays.toString(stringArr));

        /**
         * 숫자 배열 내림차순
         *  1. int 배열을 Integer 배열로 변환해야 함
         *  2. Collections.reverseOrder() 메서드로 역순 정렬 - Collections.reverseOrder() 메서드를 사용하기 위해서는 Integer 배열이어야 함
         */
        Integer[] integerArr = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println("Reverse sorted integerArr = " + Arrays.toString(integerArr));

        /**
         * 지정한 범위만 정렬
         *  - fromIndex 부터(포함) toIndex 전까지 (미포함)
         */
        Arrays.sort(integerArr, 1, 4, Collections.reverseOrder()); //
        System.out.println("integerArr = " + Arrays.toString(integerArr));

    }
}
