package com.ohgiraffers.practice;

import com.ohgiraffers.practice.Calculator;

public class Application01 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.checkMethod();
        int a = 10;
        int b = 20;

        System.out.println("10과 20의 합 : " + calc.sumTwoNumber(a, b));
        System.out.println("10과 5의 차 : " + calc.minusTwoNumber(a, 5));
        System.out.println("10과 5의 곱 : " + calc.multiNumber(a, 5));
        System.out.println("10과 5의 나눈 후 몫 : " + calc.divideNumber(a, 5));
        System.out.println("7과 6의 나눈 후 나머지" + calc.modNumber(7, 6));

    }

}
