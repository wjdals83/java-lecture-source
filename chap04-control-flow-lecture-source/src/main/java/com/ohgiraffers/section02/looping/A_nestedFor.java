package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for 문의 흐름을 이해하고 적용할 수 있다.(1) */

        /* 필기. for 문 안에서 for 문을 이용할 수 있다. */

        /* 필기. 2단부터 단을 1씩 증가시키는 반복문 */
        for (int dan = 2; dan < 10; dan++) {

            /* 필기. 단이 1개씩 증가하는 동안 수행할 내용은 해당 단의 구구단을 출력하는 것. */
            for (int su = 1; su < 10; su++) {

                System.out.println(dan + " * " + su + " = " + (dan * su));

            }

            System.out.println();

        }

    }

    public void printUpgradeGugudan() {

        for(int dan = 2; dan < 10; dan++) {     // 2부터 9까지 단수

            printGugudanOf(dan);        // 밑의 메소드에 변수 dan 전달

            System.out.println();   //개행임

        }

    }
            // 만약 위에서 2단을 넘겨받는다면, 밑에서 수 1~9까지 반복
    public void printGugudanOf(int dan) {       //dan은 걍 매개변수를 받을 공간일 뿐. 위의 dan 변수와 다른 애임.

        for(int su = 1; su < 10; su++) {

            System.out.println(dan + " * " + su + " = " + (dan * su));

        }

    }

    public void printStarInputRowTimes() {

        /* 필기.
        *   키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*" 를 5개씩 출력하세요
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){

            for(int j = 1; j < 6; j++) {

                System.out.print("*");      // 개행 방지하기 위해 ln 삭제
                // for문 안의 {} 이 부분에 해당하는 내용을 for 문 만큼 반복하라는 뜻
                // i나 j는 그냥 for문 사용을 위한 변수임. 큰 의미 없음
            }

            System.out.println();

        }

    }

}
