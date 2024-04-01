package com.ohgiraffers.section01.thread;

public class Plane implements Runnable{ // 인터페이스 상속 받을 땐 implements!!!!
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("비행기가 날고 있습니다~~");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



}
