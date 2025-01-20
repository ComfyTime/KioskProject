package com.example.kiosk.LV1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //input
        MenuItem ShackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem SmokeShack = new MenuItem("SmokeShack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem Cheeseburger = new MenuItem("Cheeseburger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem Hamburger = new MenuItem("Hamburger",5.4,"비프패티를 기반으로 야채가 들어간 기본버거");

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. "+ShackBurger.getMenuItem(0)+"   | W : "+ShackBurger.getMenuItem(1)+" | "+ShackBurger.getMenuItem(2));
        System.out.println("2. "+SmokeShack.getMenuItem(0)+"    | W : "+SmokeShack.getMenuItem(1)+" | "+SmokeShack.getMenuItem(2));
        System.out.println("3. "+Cheeseburger.getMenuItem(0)+"  | W : "+Cheeseburger.getMenuItem(1)+" | "+Cheeseburger.getMenuItem(2));
        System.out.println("4. "+Hamburger.getMenuItem(0)+"     | W : "+Hamburger.getMenuItem(1)+" | "+Hamburger.getMenuItem(2));
        System.out.println("0. 종료   | 종료");
        //반복으로 처리할 방법?


        //Scanner호출
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        while (true) {
            switch (inputNum) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    System.out.println("1. " + ShackBurger.getMenuItem(0) + "   | W : " + ShackBurger.getMenuItem(1) + " | " + ShackBurger.getMenuItem(2));
                case 2:
                    System.out.println("2. " + SmokeShack.getMenuItem(0) + "    | W : " + SmokeShack.getMenuItem(1) + " | " + SmokeShack.getMenuItem(2));
                case 3:
                    System.out.println("3. " + Cheeseburger.getMenuItem(0) + "  | W : " + Cheeseburger.getMenuItem(1) + " | " + Cheeseburger.getMenuItem(2));
                case 4:
                    System.out.println("4. " + Hamburger.getMenuItem(0) + "     | W : " + Hamburger.getMenuItem(1) + " | " + Hamburger.getMenuItem(2));
            }
        }

    }
}
