package com.ohgiraffers.test;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 매개변수와 리턴값을 복합적으로 활용해보자 */

        Application03 app3 = new Application03();
        int result1 = app3.plusTwoNumber(40, 50);
        System.out.println("40 + 50 = " + result1);
        int result2 = app3.minusTwoNumber(60, 50);
        System.out.println("60 - 50 = " + result2);

    }

    public int plusTwoNumber(int first, int second){

        return first + second;

    }

    public int minusTwoNumber(int first, int second){

        return first - second;

    }

}
