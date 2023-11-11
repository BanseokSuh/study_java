package com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class BasicSkills {
    public static void main(String[] args) {
        /**
         * Sorting
         */
        int[] arr = {6,3,2,1,5};
        String[] arr2 = {"h", "e", "a", "c"};

        Arrays.sort(arr); // 오름차순 정렬
        Arrays.sort(arr2);
        System.out.println("Sorted arr = " + Arrays.toString(arr));
        System.out.println("Sorted arr2 = " + Arrays.toString(arr2));

        Arrays.sort(arr2, Collections.reverseOrder()); // 문자열 내림차순 정렬
        System.out.println("Reversely sorted arr2 = " + Arrays.toString(arr2));

        Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new); // int 배열을 Integer 배열로 변환
        Arrays.sort(arr3, Collections.reverseOrder()); // Collections.reverseOrder() 메서드를 사용하기 위해서는 Integer 배열이어야 한다.

        // 지정한 범위만 정렬
//        Arrays.sort(arr3, 1, 3);
        System.out.println("arr3 = " + Arrays.toString(arr3));
        Arrays.sort(arr3, 1, 3, Collections.reverseOrder());
        System.out.println("arr3 = " + Arrays.toString(arr3));
    }



}
