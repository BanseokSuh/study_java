package com.datastructure;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5]; // 선언 시 크기 정해줘야 함

        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println("colors[0] = " + colors[0]);
        System.out.println("colors[1] = " + colors[1]);
        System.out.println("colors[2] = " + colors[2]);
        System.out.println("colors[3] = " + colors[3]);
        System.out.println("colors[4] = " + colors[4]);
//        System.out.println("colors[5] = " + colors[5]); // Array index out of bounds

        colors[2] = "yellow";

        System.out.println("colors = " + Arrays.toString(colors)); // 배열을 로그로 보기 위해서는 toString()을 사용

        int[] numbers = {100, 200}; // 선언 및 초기화 동시에

        for (int i = 0; i < colors.length; i++) {
            System.out.println("colors[i] = " + colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println("colors[i] = " + colors[i]);
        }

        for (String color : colors) {
            System.out.println("color = " + color);
        }

        Arrays.stream(colors).forEach(System.out::println); // util 클래스를 이용한 loop
    }
}
