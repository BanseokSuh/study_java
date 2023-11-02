package com.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        /**
         * List는 인터페이스,
         * ArrayList는 구현체
         */
        List<String> colors = new ArrayList();

        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        /**
         * 제네릭을 사용하여 타입을 지정하지 않으면 다른 타입도 추가 가능
         */
//        colors.add(1);
//        colors.add(new Object());

        System.out.println("colors = " + colors);
        System.out.println("colors = " + colors.size());
        System.out.println("colors = " + colors.contains("yellow"));
        System.out.println("colors = " + colors.contains("pink"));

        for (String color : colors) {
            System.out.println("color = " + color);
        }

        colors.stream().forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }


        /**
         * ArrayList로 생성하고, ArrayList로 받을 수 있다.
         * 하지만 확장성을 위해 클래스가 아닌 인터페이스로 받음으로써,
         * LinkedList와 같은 다른 구현체와 쉽게 교체가 가능하게 하는 것이 좋다.
         */
        ArrayList list = new ArrayList();
//        ArrayList list2 = new LinkedList<>();

        List<String> colorsUnmodifiable = List.of( // list를 고정시킬 수 있음
                "blue",
                "yellow",
                "purple"
        );
//        colorsUnmodifiable.add("pink"); // 에러 발생.


        System.out.println("colorsUnmodifiable = " + colorsUnmodifiable);
    }



}
