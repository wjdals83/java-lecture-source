package com.ohgiraffers.section02.looping_practice.question;

import java.util.Scanner;

public class Question_while {

    public static void main(String[] args) {

        Question_while question_while = new Question_while();
        question_while.whileTest1();
        question_while.whileTest2();
        question_while.whileTest3();
        question_while.whileTest4();

    }

    public void whileTest1() {

        // 문제. 1부터 10까지의 숫자 출력하기
        System.out.println("=======1부터 10까지의 숫자를 출력=======");

        int i = 1;

        while(i < 11) {

            System.out.println("1부터 10까지의 숫자 출력하기 : " + i);

            i++;

        }

    }

    public void whileTest2() {

        // 문제. 10부터 1까지의 숫자를 역순으로 출력
        System.out.println("===========10부터 1까지의 숫자 역순 출력==========");

        int i = 10;

        while(i > 0) {

            System.out.println("10부터 1까지 숫자 역순으로 출력 : " + i);

            i--;

        }

    }

    public void whileTest3() {

        // 문제. 구구단 7단까지 출력하기

        System.out.println("===============구구단 7단까지============");

        int i = 2;

        while (i < 8) {

            int j = 1;

            while (j <10) {

                System.out.println(i + " * " + j  + " = " + (i * j));
                j++;
            }

            i++;
            System.out.println();
        }

    }

    public void whileTest4() {

        // 문제. 1부터 100까지 숫자 중 짝수만 출력하기
        System.out.println("=================1 ~ 100 짝수만 출력===========");

        int i = 1;
        while(i < 101) {

            if(i % 2 == 0) {

                System.out.println(i);
            }

            i++;

        }

    }

    public void whileTest5() {

        Scanner sc = new Scanner(System.in);


    }

}
