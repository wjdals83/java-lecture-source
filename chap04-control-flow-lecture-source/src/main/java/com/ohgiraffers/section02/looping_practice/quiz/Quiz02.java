package com.ohgiraffers.section02.looping_practice.quiz;

public class Quiz02 {

    public static void main(String[] args) {

        Quiz02 quiz02 = new Quiz02();
        quiz02.clock();


    }

    public void clock() {

        for (int hour = 0; hour <= 23; hour++) {

            for (int minute = 0; minute <= 59; minute++) {

                System.out.println(hour + "시 " + minute + "분");
            }

        }

    }

}
