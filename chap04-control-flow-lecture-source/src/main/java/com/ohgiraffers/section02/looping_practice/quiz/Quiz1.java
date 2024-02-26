package com.ohgiraffers.section02.looping_practice.quiz;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

//        Quiz1 quiz1 = new Quiz1();
//        quiz1.testQuiz1();
        Quiz1 quiz1 = new Quiz1();
        quiz1.testQuiz2();

    }

    public void testQuiz1() {

        // 문제. 1-1. 1시부터 12시까지 출력해보자

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + "시");
        }

    }

    public void testQuiz2() {

        // 문제. 1-2-1. 2부터 20까지의 짝수를 출력해보자

        for (int i = 1; i <= 10; i++) {

            int multi = i *2;

            System.out.println(multi);
        }

        for (int i = 2; i <= 20; i = i + 2) {

            System.out.println(i);
        }

    }

}
