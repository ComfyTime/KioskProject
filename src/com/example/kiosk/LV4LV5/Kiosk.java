package com.example.kiosk.LV4LV5;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final List<Menu> menus;
    private final List<MenuItem> menuItems;
    private final List<MenuItem> drinks;
    private final List<MenuItem> sides;

    public Kiosk(List<Menu> menus){
        this.menus = menus;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < 3; i++){
                Menu menu = menus.get(i);
                System.out.println((i + 1) + ". " + menus.getCategory());
                System.out.println("0. 종료   | 종료");
            }

            int menuNum = sc.nextInt();
            switch (menuNum){
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                case 1:
                    System.out.println("[ SHAKESHACK MENU ]");
                    for (int i = 0; i < 4; i++) {
                        MenuItem menuItems = menuItems.get(i);
                        System.out.println((i + 1) + ". " + menuItems.getName() + "   | W : " + menuItems.getPrice() + " | " + menuItems.getDesc());
                        System.out.println("0. 종료   | 종료");
                    }

                    int inputNum = sc.nextInt();

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
                case 2:
                    System.out.println("[ DRINK MENU ]");
                    for (int i = 0; i < 1; i++) {
                        MenuItem drinks = drinks.get(i);
                        System.out.println((i + 1) + ". " + drinks.getName() + "   | W : " + drinks.getPrice() + " | " + drinks.getDesc());
                        System.out.println("0. 종료   | 종료");
                    }

                    int inputNum2 = sc.nextInt();

                    switch (inputNum2) {
                        case 0:
                            System.out.println("프로그램을 종료합니다.");
                            break;
                        case 1:
                            System.out.println(inputNum2 + ". " + drinks.get(0).getName() + "   | W : " + drinks.get(0).getPrice() + " | " + drinks.get(0).getDesc());
                    }
                case 3:
                    System.out.println("[ SIDE MENU ]");
                    for (int i = 0; i < 1; i++) {
                        MenuItem sides = sides.get(i);
                        System.out.println((i + 1) + ". " + sides.getName() + "   | W : " + sides.getPrice() + " | " + sides.getDesc());
                        System.out.println("0. 종료   | 종료");
                    }

                    int inputNum3 = sc.nextInt();

                    switch (inputNum3) {
                        case 0:
                            System.out.println("프로그램을 종료합니다.");
                            break;
                        case 1:
                            System.out.println(inputNum3 + ". " + sides.get(0).getName() + "   | W : " + sides.get(0).getPrice() + " | " + sides.get(0).getDesc());
                    }
            }
        }
    }
}
