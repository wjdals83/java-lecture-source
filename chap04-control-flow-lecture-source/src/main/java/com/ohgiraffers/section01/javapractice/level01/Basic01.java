package com.ohgiraffers.section01.javapractice.level01;

import java.util.Scanner;

public class Basic01 {

    public static void main(String[] args) {

        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        Basic01 basic = new Basic01();
        basic.practice01();

    }

    public void practice01() {

        System.out.print("정수를 하나 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int oneInt = sc.nextInt();

        if(oneInt > 0) {

            System.out.println("양수다.");
        } else {

            System.out.println("양수가 아니다.");
        }

    }

}
