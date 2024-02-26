package com.ohgiraffers.section01.javapractice.switcase_practice;

import java.util.Scanner;

public class Switch_case_practice {

    public static void main(String[] args) {

        /* 필기. 사용자로부터 점수를 입력받아 점수가 90이상이면 'A',
            90미만 80이상이면 'B', 80미만 70이상이면 'C',
            70미만 60이상이면 'D', 그 미만이면 'F'를
            출력하는 Code를 작성하라.*/
//이럴 경우 점수를 10으로 나눈 몫으로 판별하면 된다.

        Switch_case_practice practice = new Switch_case_practice();
        practice.grade();


    }

    public void grade() {

        System.out.print("점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = (sc.nextInt() / 10);      //등급에 해당하는 num은 10으로 나눈 몫일 것

        char grade = 0;

        switch (num) {

            case 10 :
                grade = 'A';
                break;
            case 9 :
                grade = 'A';
                break;
            case 8 :
                grade = 'B';
                break;
            case 7 :
                grade = 'C';
                break;
            case 6 :
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;

        }

        System.out.println("당신의 학점은 " + grade + " 입니다.");


    }

}
