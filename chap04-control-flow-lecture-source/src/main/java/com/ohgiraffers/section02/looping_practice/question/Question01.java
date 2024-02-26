package com.ohgiraffers.section02.looping_practice.question;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {

        Question01 question01 = new Question01();
        question01.printNumbers();
        question01.printReversNumbers();
        question01.Gugudan();
        question01.printOneToHundred();
        question01.printOneToHundred2();
        question01.factorial();

    }

    // 문제. 1부터 10까지의 숫자를 출력하는 프로그램
    public void printNumbers() {

        System.out.println("====1부터 10까지의 숫자 출력하기====");

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }

    }

    // 문제. 10부터 1까지의 숫자를 역순으로 출력하는 프로그램
    public void printReversNumbers() {

        System.out.println("====10부터 1까지의 숫자 역순으로 출력하기====");

        for (int i = 10; i >= 1; i--){

            System.out.println(i);
        }
    }

    // 문제. 구구단 7단을 출력하는 프로그램
    public void Gugudan() {

        System.out.println("====구구단 7단 출력하기====");

        for (int i = 1; i <= 9; i++) {

            System.out.println(7 + " * " + i + " = " + (7 * i) );
        }

    }

    // 문제. 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램

    public void printOneToHundred() {

        System.out.println("1부터 100까지의 숫자 중 짝수만 출력하기");

        for (int i = 1; i <= 50; i++){

            int multi = i * 2;

            System.out.println(multi);

        }


    }

    public void printOneToHundred2() {

        System.out.println("1부터 100까지의 숫자 중 짝수만 출력하기2");

        for (int i = 2; i <= 100; i += 2) {

            System.out.println(i);
        }

    }

    // 문제. 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
    public void factorial() {

        System.out.println("====사용자로부터 입력받은 숫자의 팩토리얼 계산하기====");


        Scanner sc = new Scanner(System.in);
        System.out.print("팩토리얼을 구하고 싶은 숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        int result = 1;

        String output = num + "! = ";

        for (int i = 1; i <= num; i++) {

            result *= i;     // result = result * i



        }

        System.out.println(result);

    }

}
