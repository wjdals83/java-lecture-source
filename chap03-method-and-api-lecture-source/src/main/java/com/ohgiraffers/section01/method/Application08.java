package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */
        /* 필기.
        *   static 메소드 호출
        *   */

        /* 필기.
        *   static 메소드 호출하는 방법
        *   클래스명.메소드명(); <- 이런 방식으로 호출한다.
        * */

//        Application08.sumTwoNumbers(10, 20);
        System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10, 20));       //진짜 바로 호출 가능함. 애초에 공간이 만들어진 채로 시작했기 때문에.

        /* 필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다. */
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20, 30));

    }

    public static int sumTwoNumbers(int first, int second) {        //매개변수는 각각 인수를 담을 상자라고 생각하자

        return first + second;

    }

}
