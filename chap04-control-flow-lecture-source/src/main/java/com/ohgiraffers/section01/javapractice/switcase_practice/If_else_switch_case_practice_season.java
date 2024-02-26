package com.ohgiraffers.section01.javapractice.switcase_practice;

import java.util.Scanner;

public class If_else_switch_case_practice_season {

    public static void main(String[] args) {

        /* 필기. 3~5월 "현재 계절을 봄입니다."
            6~8월 "현재 계절은 여름입니다."
            9~11월 "현재 계절은 가을입니다."
            12월~2월 "현재 계절은 겨울입니다."
            입력예) 현재 월을 입력하세요. : 3 출력예) 현재 계절은 봄입니다.
             출처: https://moalgong.tistory.com/1 [모알공 - 모르니까 알 때까지 공부!:티스토리]
           */

        /* 필기.
        *   월을 3으로 나누었을 때 3~5는 1
        *   6~8은 2
        *   9~11은 3이 나올 것. 겨울은 일부러 초기화 값으로 냅두기!
        * */

        If_else_switch_case_practice_season season = new If_else_switch_case_practice_season();
        season.season();

    }

    public void season() {

        System.out.print("현재 월을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        String fourseasons = "겨울";      // 겨울 값을 초기화 값으로 설정.

        if (month >= 1 && month <= 12) {

            switch (month / 3){

                case 1 :
                    fourseasons = "봄";
                    break;

                case 2 :
                    fourseasons = "여름";
                    break;

                case 3:
                    fourseasons = "가을";
                    break;

            }

        }else {

            System.out.println("입력값이 잘못되었습니다. ");
        }

        System.out.println("현재 계절은 " + "'" + fourseasons + "'"+ " 입니다.");
    }

}
