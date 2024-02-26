package com.chap01.level02;

public class Application02 {

    public static void main(String[] args) {

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int total = (int) (korean + math + english);
        int avg = total / 3;

        System.out.println("총점 : " + total + "점");
        System.out.println("평균 : " + avg + "점");


    }

}
