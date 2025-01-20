package com.example.kiosk.LV3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < 4; i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).getName() + "   | W : " + menuItems.get(i).getPrice() + " | " + menuItems.get(i).getDesc());
                System.out.println("0. 종료   | 종료");
            }
            switch (inputNum) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    System.out.println(inputNum + ". " + menuItems.get(0).getName() + "   | W : " + menuItems.get(0).getPrice() + " | " + menuItems.get(0).getDesc());
                case 2:
                    System.out.println(inputNum + ". " + menuItems.get(1).getName() + "   | W : " + menuItems.get(1).getPrice() + " | " + menuItems.get(1).getDesc());
                case 3:
                    System.out.println(inputNum + ". " + menuItems.get(2).getName() + "   | W : " + menuItems.get(2).getPrice() + " | " + menuItems.get(2).getDesc());
                case 4:
                    System.out.println(inputNum + ". " + menuItems.get(3).getName() + "   | W : " + menuItems.get(3).getPrice() + " | " + menuItems.get(3).getDesc());
            }
        }
    }
}
