package com.example.kiosk.LV4LV5;

import java.util.ArrayList;
import java.util.List;


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
        List<MenuItem> drink = new ArrayList<>();
        drink.add(
                new MenuItem("Coke" , 2.0, "Zero Sugar")
        );
        List<MenuItem> side = new ArrayList<>();
        side.add(
                new MenuItem("French fries", 2.0, "Potato")
        );


        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

        Menu burgers = new Menu("Burgers", menuItems);
        Menu drinks = new Menu("Drinks", drink);
        Menu sides = new Menu("Sides", side);

    }
}
