package com.ohgiraffers.section01.javapractice.level02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Normal02 {

    public static void main(String[] args) {

        Normal02 normal02 = new Normal02();
        normal02.passNonPass();

    }

    public void passNonPass(){

        System.out.print("영어 점수를 입력하세요 : ");
        Scanner sc1 = new Scanner(System.in);
        double english = sc1.nextDouble();

        System.out.print("수학 점수를 입력하세요 : ");
        Scanner sc2 = new Scanner(System.in);
        double math = sc1.nextDouble();

        double average = (english + math) / 2;

        if(math > 40 && english > 40) {

            if (average >= 60){

                System.out.println("합격");
            } else {

                System.out.println("불합격");
            }
        } else {

            System.out.println("불합격");
        }

    }

}
