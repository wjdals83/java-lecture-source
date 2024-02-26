package com.ohgiraffers.section01.javapractice.level03;

import java.util.Scanner;

public class Hard {

    public static void main(String[] args) {

        Hard hard = new Hard();
        hard.bmiCalculator();

    }

    public void bmiCalculator() {

        System.out.print("당신의 체중(kg)을 입력해주세요 : ");
        Scanner sc1 = new Scanner(System.in);
        int weight = sc1.nextInt();

        System.out.print("당신의 신장(m)을 입력해주세요 : ");
        Scanner sc2 = new Scanner(System.in);
        double height = (sc2.nextDouble() / 100);

        double bmi = weight/(height*height);

        if (bmi < 20) {

            System.out.println("당신은 저체중 입니다. ");
        } else if (bmi >= 20 && bmi < 25) {

            System.out.println("당신은 정상체중 입니다. ");
        } else if (bmi >= 25 && bmi < 30) {

            System.out.println("당신은 과체중 입니다. ");
        } else if (bmi >= 30) {

            System.out.println("당신은 비만 입니다. ");
        }

    }

}
