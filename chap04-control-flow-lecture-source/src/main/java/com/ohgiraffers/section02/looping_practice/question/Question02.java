package com.ohgiraffers.section02.looping_practice.question;

public class Question02 {

    public static void main(String[] args) {

        Question02 question02 = new Question02();
        question02.printStar1();
        question02.printStar2();

    }

    // 문제. 별 만들기 게임1
    public void printStar1() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

    }

    public void printStar2() {

        System.out.println("=============별 만들기2===========");       //모르겠다 ㅜㅜㅜ

        int multi = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 3; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }

            for (int j = 3; j >= 0; j--) {
                System.out.print(" ");
            }

        }

        System.out.println();

    }

}
