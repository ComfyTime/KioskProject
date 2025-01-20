package com.example.kiosk.LV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(
                new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        );
        menuItems.add(
                new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        );
        menuItems.add(
                new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
        );
        menuItems.add(
                new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
        );

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < 4; i++) {
                System.out.println((i+1)+". "+ menuItems.get(i).getName()+"   | W : "+ menuItems.get(i).getPrice()+" | "+ menuItems.get(i).getDesc());
                System.out.println("0. 종료   | 종료");
            }
            switch (inputNum) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    System.out.println(inputNum + ". " + menuItems.get(0).getName() + "   | W : " + menuItems.get(0).getPrice()+ " | " + menuItems.get(0).getDesc());
                case 2:
                    System.out.println(inputNum + ". " + menuItems.get(1).getName() + "   | W : " + menuItems.get(1).getPrice()+ " | " + menuItems.get(1).getDesc());
                case 3:
                    System.out.println(inputNum + ". " + menuItems.get(2).getName() + "   | W : " + menuItems.get(2).getPrice()+ " | " + menuItems.get(2).getDesc());
                case 4:
                    System.out.println(inputNum + ". " + menuItems.get(3).getName() + "   | W : " + menuItems.get(3).getPrice()+ " | " + menuItems.get(3).getDesc());
            }
        }




    }
}
